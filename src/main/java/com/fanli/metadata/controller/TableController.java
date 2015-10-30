package com.fanli.metadata.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fanli.metadata.dao.base.EtlMetaColumnMapper;
import com.fanli.metadata.dao.base.EtlMetaHiveTableMapper;
import com.fanli.metadata.dao.base.EtlMetaPartitionMapper;
import com.fanli.metadata.dao.base.EtlMetaTableBaseMapper;
import com.fanli.metadata.entity.Result;
import com.fanli.metadata.entity.base.*;
import com.fanli.metadata.util.CommonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2015/10/3.
 */
@Controller
@RequestMapping("/tables")
public class TableController {
    @Autowired
    private EtlMetaTableBaseMapper etlMetaTableBaseMapper;

    @Autowired
    private EtlMetaHiveTableMapper etlMetaHiveTableMapper;

    @Autowired
    private EtlMetaColumnMapper etlMetaColumnMapper;

    @Autowired
    private EtlMetaPartitionMapper etlMetaPartitionMapper;



    /**
     * 根据用户输入的关键字检索出相关的表
     * @param keyword 关键字
     * @return 返回table信息列表
     */
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Result<EtlMetaTableBase> findTablesByParams
            (@RequestParam(value = "keyword",required = false) String keyword) {

        Result<EtlMetaTableBase> result = new Result<EtlMetaTableBase>();
//        EtlMetaTableBaseExample example = new EtlMetaTableBaseExample();
//        EtlMetaTableBaseExample.Criteria criteria = example.createCriteria();
//        if (keyword != null) {
//            criteria.andTableNameLike("%" + keyword + "%");
//        }

        List<EtlMetaTableBase> list = etlMetaTableBaseMapper.findTablesByNameFuzzy(keyword);
        if (list != null) {
            result.setResults(list);
            result.setCount(list.size());
        }
        result.setIsSuccess(true);
//        List<EtlMetaTableBase> list = new ArrayList<EtlMetaTableBase>();
//        for(int i = 0;i < 30;i ++) {
//            EtlMetaTableBase base = new EtlMetaTableBase();
//            base.setOwner("沈伟");
//            base.setTableComment("这是一张神奇的表");
//            base.setTableName("dim_city_id_by_group");
//            base.setStorageType("hive");
//            base.setId(100211);
//            list.add(base);
//        }
//        result.setCount(list.size());
//        result.setIsSuccess(true);
//        result.setResults(list);
        return result;

    }

    @RequestMapping(value = "/{tableId}",method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> getModelDetail(@PathVariable Integer tableId) {
        Result result = new Result();
        Map<String,Object> map = new HashMap<String, Object>();
        EtlMetaTableBase model = etlMetaTableBaseMapper.findTableById(tableId);
        //根据table base表中信息初始化模型
        JSONObject modelData = (JSONObject) JSON.toJSON(model);
        String storage = model.getStorageType();
        if ("hive".equals(storage)) {
            //获取分区信息
            List<EtlMetaColumn> partitions = etlMetaColumnMapper.findColumnsByTableId(tableId,1);
            if (partitions.size() > 0) {
                modelData.put("isPartitionTable",true);
            }else modelData.put("isPartitionTable",false);
            modelData.put("partitions",partitions);

            //获取hive元数据信息 输入输出格式 压缩格式 分隔符等等
            EtlMetaHiveTable hiveMeta = etlMetaHiveTableMapper.findHiveMetaByTableId(tableId);
            modelData.put("hiveMeta",hiveMeta);

            //生成样例sql
            EtlMetaPartition partition = etlMetaPartitionMapper.selectLatestPartition(model.getHiveTableId());
            String exampleSql = CommonUtils.generateExampleSql(model,partition,partitions);
            modelData.put("exampleSql",exampleSql);

            //获取上游血缘

            //获取下游血缘

            //获取hive表大小


        }
        map.put("model",modelData);

        return map;

    }

    @RequestMapping(value = "/{tableId}/comment",method = RequestMethod.POST)
    @ResponseBody
    public Result updateTableComment(@PathVariable("tableId") Integer tableId,
                                        @RequestParam("tableComment") String tableComment) {
        Result result = new Result();
        try {
            etlMetaTableBaseMapper.updateTblComment(tableId,tableComment);
        }catch (Exception e) {
            result.setIsSuccess(false);
            result.setMsg("update table comment failed!");
            return result;
        }
        result.setIsSuccess(true);
        return result;
    }

}

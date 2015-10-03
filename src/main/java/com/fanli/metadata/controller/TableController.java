package com.fanli.metadata.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fanli.metadata.entity.Result;
import com.fanli.metadata.entity.base.EtlMetaTableBase;
import com.fasterxml.jackson.databind.node.JsonNodeCreator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2015/10/3.
 */
@Controller
@RequestMapping("/tables")
public class TableController {
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
//
//        List<EtlMetaTableBase> list = etlMetaTableBaseMapper.selectByExample(example);
//        if (list != null) {
//            result.setResults(list);
//            result.setCount(list.size());
//        }
//        result.setIsSuccess(true);
        List<EtlMetaTableBase> list = new ArrayList<EtlMetaTableBase>();
        for(int i = 0;i < 30;i ++) {
            EtlMetaTableBase base = new EtlMetaTableBase();
            base.setOwner("沈伟");
            base.setTableComment("这是一张神奇的表");
            base.setTableName("dim_city_id_by_group");
            base.setStorageType("hive");
            base.setId(100211);
            list.add(base);
        }
        result.setCount(list.size());
        result.setIsSuccess(true);
        result.setResults(list);
        return result;

    }

    @RequestMapping(value = "/{tableId}",method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> getModelDetail(@PathVariable Integer tableId) {
        Result result = new Result();
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("title","hello");
        EtlMetaTableBase tableBase = new EtlMetaTableBase();
        tableBase.setId(1);
        JSONObject modelData = (JSONObject) JSON.toJSON(tableBase);
        System.out.println(modelData.get("id"));
        return map;

    }
}

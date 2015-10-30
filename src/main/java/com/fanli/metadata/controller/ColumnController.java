package com.fanli.metadata.controller;

import com.fanli.metadata.dao.base.EtlMetaColumnMapper;
import com.fanli.metadata.entity.Result;
import com.fanli.metadata.entity.base.EtlMetaColumn;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Administrator on 2015/10/5.
 */
@Controller
@RequestMapping("/columns")
public class ColumnController {
    private static Logger logger = Logger.getLogger(ColumnController.class);
    @Autowired
    private EtlMetaColumnMapper etlMetaColumnMapper;

    /**
     * 根据tableid 和是否是分区列 查询列信息
     * @param tableId
     * @param isPartition
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Result<EtlMetaColumn> queryColumnByParam(@RequestParam("tableId")Integer tableId,
                                                    @RequestParam("isPartition") Integer isPartition) {
        Result<EtlMetaColumn> result = new Result<EtlMetaColumn>();
        try {
            List<EtlMetaColumn> commonColumns = etlMetaColumnMapper.findColumnsByTableId(tableId,isPartition);
            result.setResults(commonColumns);
            result.setIsSuccess(true);
            result.setCount(commonColumns.size());
            return result;
        }catch (Exception e) {
            logger.error(e.getMessage());
            throw new RuntimeException("获取列信息失败");
        }

    }

//    @RequestMapping(method = RequestMethod.POST)
//    @ResponseBody
//    public Result updateColumns(@RequestParam("tableId") Long tableId,
//                                @RequestParam("columnIds") String ids,
//                                @RequestParam("columnComments") String comments) {
//        Result result = new Result();
//        String[] idList = ids.split("\\<\\*\\>");
//        String[] comList = comments.split("\\<\\*\\>");
//        if (idList.length != comList.length) {
//            result.setIsSuccess(false);
//            throw new RuntimeException("idList与commentList长度不一致！！");
//        }
//        for (int i = 0;i < idList.length;i ++) {
//            EtlMetaColumn column = new EtlMetaColumn();
//            column.setGlobalId(tableId);
//            column.setColumnId(Integer.parseInt(idList[i]));
//            column.setColumnComment(comList[i]);
//            etlMetaColumnMapper.updateColumn(column);
//        }
//        result.setIsSuccess(true);
//        return result;
//    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public Result updateColumns(@RequestParam("tableId") Long tableId,
                                @RequestParam("columnIds") List<Integer> ids,
                                @RequestParam("columnComments") List<String> comments) {
        Result result = new Result();
        for (int i = 0;i < ids.size();i ++) {
            EtlMetaColumn column = new EtlMetaColumn();
            column.setGlobalId(tableId);
            column.setColumnId(ids.get(i));
            column.setColumnComment(comments.get(i));
            etlMetaColumnMapper.updateColumn(column);
        }
        result.setIsSuccess(true);
        return result;
    }



}

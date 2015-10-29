package com.fanli.metadata.controller;

import com.fanli.metadata.dao.base.EtlMetaTableBaseMapper;
import com.fanli.metadata.entity.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by wei.shen on 2015/10/2.
 */
@Controller
public class SearchController {
    @Autowired
    private EtlMetaTableBaseMapper etlMetaTableBaseMapper;



    @RequestMapping(value = "/tableNames",method = RequestMethod.GET)
    @ResponseBody
    public Result<String> searchKeywordForAutoComplete() {
        Result<String> result = new Result<String>();
        List<String> list = etlMetaTableBaseMapper.listAllTableNames();
        if (list != null) {
            result.setResults(list);
            result.setCount(list.size());
            result.setIsSuccess(true);
        }
        return result;
    }



}

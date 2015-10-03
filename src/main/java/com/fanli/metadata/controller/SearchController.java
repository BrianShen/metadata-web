package com.fanli.metadata.controller;

import com.fanli.metadata.dao.base.EtlMetaTableBaseMapper;
import com.fanli.metadata.entity.Result;
import com.fanli.metadata.entity.base.EtlMetaTableBase;
import com.fanli.metadata.entity.base.EtlMetaTableBaseExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
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
        List<String> list = new ArrayList<String>();
        list.add("shenwei");
        list.add("shenwei2343");
        list.add("ssshenwei3re");
        list.add("ssshenwei3nwei3rre");
        list.add("ssshenwnwei3rei3re");
        result.setResults(list);
        result.setCount(5);
        return result;
    }



}

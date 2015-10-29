package com.fanli.metadata.controller;

import com.fanli.metadata.entity.Result;
import com.fanli.metadata.service.HiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wei.shen on 2015/10/29.
 */
@Controller
@RequestMapping("/hive_resource")
public class HiveController {
    @Autowired
    private HiveService hiveService;

    @RequestMapping(value = "/query",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> queryHive(@RequestParam("sql") String sql) {
        Map<String,Object> map = new HashMap<String, Object>();
        List<Map<String,Object>> result =  hiveService.queryForList(sql);
        map.put("results",result);
        map.put("isSuccess",true);
        return  map;
    }

}

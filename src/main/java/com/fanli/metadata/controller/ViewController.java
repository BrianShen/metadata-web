package com.fanli.metadata.controller;

import com.fanli.metadata.dao.base.EtlMetaTableBaseMapper;
import com.fanli.metadata.entity.Storage;
import com.fanli.metadata.entity.base.EtlMetaTableBase;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Administrator on 2015/10/1.
 */
@Controller
@RequestMapping("/pages")
public class ViewController {
    private static Logger logger = Logger.getLogger(ViewController.class);
    @Autowired
    private EtlMetaTableBaseMapper etlMetaTableBaseMapper;

//    @RequestMapping(value = "{main}/{page}",method = RequestMethod.GET)
//    public ModelAndView getViews(@PathVariable("main") String main,@PathVariable("page") String page) {
//        ModelAndView mv = new ModelAndView("main/" + main);
//        mv.addObject("page",page);
//        return mv;
//    }

    @RequestMapping(value = "/{page}",method = RequestMethod.GET)
    public ModelAndView getViews(@PathVariable("page") String page) {
        ModelAndView mv = new ModelAndView("main/index");
        mv.addObject("page",page);
        return mv;
    }

    @RequestMapping(value = "/model_detail",method = RequestMethod.GET)
    public ModelAndView modelDetailView(@RequestParam(value = "mid",required = true,defaultValue = "") Long tableId) throws Exception {
        ModelAndView mv = new ModelAndView("main/index");
        EtlMetaTableBase tableBase = etlMetaTableBaseMapper.findTableById(tableId);
        String type = tableBase.getStorageType();
        if (StringUtils.hasLength(type)) {
            if (type.equalsIgnoreCase("hive")) {
                mv.addObject("page","hive_detail");
            } else if (type.equalsIgnoreCase("mysql")||type.equalsIgnoreCase("sqlserver")) {
                mv.addObject("page","detail");
            } else if (Storage.INDICATOR.toString().equalsIgnoreCase(type)) {
              mv.addObject("page","indicator");
            } else throw new Exception("The storage type of the table is not supported now!");
        } else {
            throw new RuntimeException("The table storage type cannot be null or empty");
        }
        return mv;
    }

    @RequestMapping(value = "template/{page}",method = RequestMethod.GET)
    public String getTemplateViews(@PathVariable("page") String templatePage) {
        return "template/" + templatePage;
    }

}

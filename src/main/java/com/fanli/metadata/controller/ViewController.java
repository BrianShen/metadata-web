package com.fanli.metadata.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Administrator on 2015/10/1.
 */
@Controller
@RequestMapping("/pages")
public class ViewController {

    @RequestMapping(value = "{main}/{page}",method = RequestMethod.GET)
    public ModelAndView getViews(@PathVariable("main") String main,@PathVariable("page") String page) {
        ModelAndView mv = new ModelAndView("main/" + main);
        mv.addObject("page",page);
        return mv;
    }

    @RequestMapping(value = "template/{page}",method = RequestMethod.GET)
    public String getTemplateViews(@PathVariable("page") String templatePage) {
        return "template/" + templatePage;
    }

}

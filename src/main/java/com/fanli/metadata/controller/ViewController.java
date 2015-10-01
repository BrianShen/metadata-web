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

    @RequestMapping(value = "/{page}",method = RequestMethod.GET)
    public String getViews(@PathVariable("page") String page) {
        return page;
    }

}

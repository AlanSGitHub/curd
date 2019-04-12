package com.max.curd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 系统信息控制器
 * @author Max
 * @date 2019-04-10 下午 9:22
 * @projectName curd
 */
@Controller
public class SystemInfoController {

    @GetMapping("/addSys")
    public ModelAndView add(){
        return new ModelAndView("views/AddSystemInfo.html");
    }

    @GetMapping("/editSys")
    public ModelAndView edit(){
        return new ModelAndView("views/EditSystemInfo.html");
    }

    @GetMapping("/viewSys")
    public ModelAndView view(){
        return new ModelAndView("views/SystemInfo.html");
    }
}

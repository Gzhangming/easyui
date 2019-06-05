package com.tongc.easyui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class jspController {


    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/basic")
    public String basic(){
        return "draggable/basic";
    }

    //百度地图
    @RequestMapping("/map")
    public  String map(){
        return "map/baidumap";
    }




}

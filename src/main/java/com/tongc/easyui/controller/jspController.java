package com.tongc.easyui.controller;


import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class jspController {

    @ApiOperation(value="EasyUi学习", notes="树型图")
    @ApiImplicitParam(name = "", value = "", required = true, dataType = "", paramType = "")
    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String index(){
        return "index";
    }

    @ApiOperation(value="EasyUi学习", notes="可拖拽div")
    @ApiImplicitParam(name = "", value = "", required = true, dataType = "", paramType = "")
    @RequestMapping(value = "basic", method = RequestMethod.GET)
    public String basic(){
        return "draggable/basic";
    }

    @ApiOperation(value="百度地图", notes="获取百度地图")
    @ApiImplicitParam(name = "", value = "", required = true, dataType = "", paramType = "")
    @RequestMapping(value = "map", method = RequestMethod.GET)
    public  String map(){
        return "map/baidumap";
    }




}

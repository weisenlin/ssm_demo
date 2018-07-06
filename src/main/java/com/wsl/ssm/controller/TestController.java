package com.wsl.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * create by WSL_SILVA
 * 日期: 2018/7/6 0006
 * 用途：
 * 描述:
 */
@Controller
@RequestMapping("/")
public class TestController {

    @RequestMapping("/test.do")
    @ResponseBody
    public List test(){
//        Map<String,Object> map = new HashMap<>();
//        map.put("hello","hello");
        List<String> list =  new ArrayList<>();
        list.add("1");
        list.add("2");
        return list;
    }
}

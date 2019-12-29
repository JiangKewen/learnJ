package com.javaweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HeimaController {
    @ResponseBody
    @RequestMapping("/heima")
    public String heima() {
        return "学习黑马";
    }
}

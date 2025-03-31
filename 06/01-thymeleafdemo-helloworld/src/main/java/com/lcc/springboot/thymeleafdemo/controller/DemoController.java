package com.lcc.springboot.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController{

    @GetMapping
    public String sayHello(Model theModel){
        theModel.addAttribute("theDate", java.time.LocalDateTime.now());
//        theModel.addAttribute("theDate", 12.12);
        return "helloworld";

    }

}

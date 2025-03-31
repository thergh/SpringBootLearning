package com.lcc.springboot.thymeleafdemo.controller;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController{

    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld";
    }

    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request, Model model){
        String theName = request.getParameter("studentName");
        String uppercaseName = theName.toUpperCase();
        String result = "Hey - " + uppercaseName;
        model.addAttribute("message", result);

        return "helloworld";
    }
}

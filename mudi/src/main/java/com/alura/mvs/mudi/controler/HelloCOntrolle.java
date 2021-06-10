package com.alura.mvs.mudi.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloCOntrolle {

    @GetMapping("/hello")
    public  String hello(HttpServletRequest request){
        request.setAttribute("nome", "mundo");
        return "hello";
    }
}

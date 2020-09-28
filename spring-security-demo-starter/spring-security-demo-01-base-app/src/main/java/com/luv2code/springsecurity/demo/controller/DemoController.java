package com.luv2code.springsecurity.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class DemoController {

    @GetMapping String showHome(){
        return "home";
    }
}

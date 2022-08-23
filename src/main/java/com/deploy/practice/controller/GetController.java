package com.deploy.practice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetController {

    @RequestMapping("/hi")
    public String hello() {
        return "Hello?";
    }
}

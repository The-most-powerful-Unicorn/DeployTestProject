package com.deploy.practice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GetController {


    @GetMapping(path = "yabal")
    public String hello() {
        return "Hello?";
    }
}

package com.deploy.practice.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class PostController {
    @PostMapping("/domain")
    public String testPostMethod (@RequestBody Map <String, String> postdata){
        StringBuilder sb = new StringBuilder();

        postdata.entrySet().forEach(entry -> {
            System.out.println(entry.getKey()+ " = " + entry.getValue()+ "\n" );
            sb.append(entry.getKey()+ " = " + entry.getValue()+"\n");
        });

        return sb.toString();
    }
}

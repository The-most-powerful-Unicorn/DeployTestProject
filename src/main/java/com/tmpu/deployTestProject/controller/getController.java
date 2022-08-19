package com.tmpu.deployTestProject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class getController {
    @RequestMapping(value = {"/test/call"})
    @ResponseBody
    public Map testRequest(HttpServletRequest request) {
        Map Response = new HashMap<String, Object>();
        Response.put("이름", "K-JUNA");
        Response.put("소속", "The-Most-Powerful-UniCorn");
        return Response;
    }
}
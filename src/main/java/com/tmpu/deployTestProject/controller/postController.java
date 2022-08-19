package com.tmpu.deployTestProject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")

public class postController {

    @RequestMapping(value = "/domain", method = RequestMethod.POST)
    @ResponseBody
    public Map testRequest (HttpServletRequest request){
        Map response = new HashMap<String, Object>();
        response.put("이름","ID");
        response.put("ID","ID");
        return response;
    }
}

package com.tmpu.deployTestProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
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
        public Map testCall (HttpServletRequest request){
            Map result = new HashMap<String, Object>();
            result.put("이름","ID");
            result.put("ID","ID");
            return result;
    }
}
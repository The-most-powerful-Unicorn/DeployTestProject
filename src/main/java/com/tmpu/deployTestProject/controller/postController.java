package com.tmpu.deployTestProject.controller;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")

public class postController {

    @PostMapping(path = "/domain")
    public String testPostMethod1(@RequestBody Map<String, String> quesryParameterMap) {
        StringBuilder sb = new StringBuilder();

        quesryParameterMap.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " = " + entry.getValue() + "\n");
            sb.append(entry.getKey() + " = " + entry.getValue() + "\n");
        });
        return sb.toString();
    }
}
//    public Map testCall (HttpServletRequest request){
//        Map result = new HashMap<String, Object>();
//        result.put("이름","ID");
//        result.put("ID","ID");
//        return result;
//    }
//}

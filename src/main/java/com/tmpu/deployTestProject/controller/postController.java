package com.tmpu.deployTestProject.controller;

import com.google.gson.Gson;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController // controller임을 알려주는 표시
@RequestMapping("/api") //이곳으로 들어오는 API주소
public class postController {
    @PostMapping(path = "/domain")
    public String postMember(@RequestBody Map<String, Object> postData) {

        Gson gson = new Gson();

        //Json 변환 부분
        String jsonRequest = gson.toJson(postData);

        return jsonRequest;
    }
}

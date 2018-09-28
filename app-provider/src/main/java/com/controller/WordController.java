package com.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author pangbohuan
 * @description Spring Cloud Hello Word
 * @date 2018-09-27 09:59
 **/
@RestController
@RequestMapping("/word")
public class WordController {

    @Value("${server.port}")
    private String port;

    @PostMapping("/hi")
    public String getWord(@RequestBody Map<String, String> map) {
        return "Spring Cloud!" + map.get("hello") + "word!providerPort=" + port;
    }
}

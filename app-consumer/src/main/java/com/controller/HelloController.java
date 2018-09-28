package com.controller;

import com.api.WordServer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author pangbohuan
 * @description Spring Cloud Hello Word
 * @date 2018-09-27 09:59
 **/
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Value("${server.port}")
    private String port;

    @Resource
    private WordServer wordServer;

    @GetMapping("/hi")
    public String gethello() {
        Map<String, String> map = new HashMap(1);
        map.put("hello", "hello");
        String body = wordServer.getWord(map);
        body += ",consumerPort=" + port;
        return body;
    }
}

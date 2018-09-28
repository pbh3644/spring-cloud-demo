package com.api;

import com.api.impl.WordServerImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

/**
 * @author pangbohuan
 * @description Fegin 伪造接口测试
 * @date 2018-09-27 10:14
 **/
@FeignClient(value = "app-provider", path = "/word/", fallback = WordServerImpl.class)
public interface WordServer {

    @PostMapping("hi")
    String getWord(Map<String, String> map);
}

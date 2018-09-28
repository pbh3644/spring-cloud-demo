package com.api.impl;

import com.api.WordServer;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author pangbohuan
 * @description 熔断机制 失败后回调函数
 * @date 2018-09-27 10:17
 **/
@Component
public class WordServerImpl implements WordServer {

    @Override
    public String getWord(Map<String, String> map) {
        return "服务器正在重启，请稍后重试";
    }
}

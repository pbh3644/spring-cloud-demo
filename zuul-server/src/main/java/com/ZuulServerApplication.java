package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

/**
 * @author pangbohuan
 * @description ZUUL反向代理（路由规则）
 * @date 2018-09-27 10:40
 **/
@EnableEurekaClient
@SpringBootApplication
@EnableZuulProxy
@EnableZuulServer
public class ZuulServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulServerApplication.class, args);
    }
}

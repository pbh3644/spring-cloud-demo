package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author pangbohuan
 * @description 服务提供者
 * @date 2018-09-27 09:49
 **/
@EnableFeignClients
@EnableHystrix
@EnableEurekaClient
@SpringBootApplication
public class AppProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(AppProviderApplication.class, args);
    }
}

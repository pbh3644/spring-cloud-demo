package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author pangbohuan
 * @description 服务的消费者
 * @date 2018-09-27 10:06
 **/
@EnableFeignClients
@EnableHystrix
@EnableEurekaClient
@SpringBootApplication
public class AppConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(AppConsumerApplication.class, args);
    }
}

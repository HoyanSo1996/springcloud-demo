package com.omega.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.omega.springcloud.service") // 开启 Feign 功能
// @EnableFeignClients(clients = {UserWebService.class})
@EnableDiscoveryClient  // 开启配置发现功能
@SpringBootApplication
public class UserServiceConsumerApplication02 {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceConsumerApplication02.class, args);
    }
}

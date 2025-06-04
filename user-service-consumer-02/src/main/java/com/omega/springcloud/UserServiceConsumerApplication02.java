package com.omega.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient  // 开启配置发现功能
@SpringBootApplication
public class UserServiceConsumerApplication02 {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceConsumerApplication02.class, args);
    }
}

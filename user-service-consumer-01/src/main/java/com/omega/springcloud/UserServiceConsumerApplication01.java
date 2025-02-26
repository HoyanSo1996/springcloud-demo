package com.omega.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient // 开启 eureka client
@SpringBootApplication
public class UserServiceConsumerApplication01 {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceConsumerApplication01.class, args);
    }
}

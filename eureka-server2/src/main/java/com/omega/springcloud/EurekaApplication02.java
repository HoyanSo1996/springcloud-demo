package com.omega.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer  // 声明 Eureka Server
@SpringBootApplication
public class EurekaApplication02 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication02.class, args);
    }
}

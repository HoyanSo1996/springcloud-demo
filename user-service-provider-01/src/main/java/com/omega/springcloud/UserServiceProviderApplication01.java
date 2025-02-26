package com.omega.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient // 开启 eureka client
@SpringBootApplication
@MapperScan("com.omega.springcloud.mapper")
public class UserServiceProviderApplication01 {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceProviderApplication01.class, args);
    }
}

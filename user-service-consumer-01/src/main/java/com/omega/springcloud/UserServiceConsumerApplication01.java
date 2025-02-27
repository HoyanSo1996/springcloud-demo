package com.omega.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//@RibbonClients(defaultConfiguration = RibbonRule.class)
//@RibbonClients({
//        @RibbonClient(name = "AService", configuration = ARibbonRule.class),
//        @RibbonClient(name = "BService", configuration = BRibbonRule.class)
//})
//@RibbonClient(name = "USER_SERVICE_PROVIDER", configuration = RibbonRule.class)
@EnableDiscoveryClient  // 开启 服务发现功能
@EnableEurekaClient // 开启 eureka client
@SpringBootApplication
public class UserServiceConsumerApplication01 {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceConsumerApplication01.class, args);
    }
}

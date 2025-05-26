package com.omega.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class CustomizationBean {

    /**
     * 无论服务提供者是单个还是集群, 都要使用注解 @LoadBalanced 赋予 RestTemplate 负载均衡的能力,
     * 即选择 user-service-provider 的某一个服务进行访问，否则会报错 UnknownHostException。
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
package com.omega.springcloud.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@RefreshScope // 方式一: 实现配置信息自动刷新 (是 springcloud 的原生注解)
@Configuration
@Data
public class NacosConfig {

    @Value("${config.username}")
    private String username;

    @Value("${config.password}")
    private String password;
}


// @ConfigurationProperties(prefix = "config")  // 方式二: 指定配置信息的前缀名
// @Configuration
// @Data
// public class NacosConfig {
//
//     private String username;
//
//     private String password;
// }

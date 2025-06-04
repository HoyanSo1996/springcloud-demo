package com.omega.springcloud.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
public class NacosConfig {

    @Value("${config.username}")
    private String username;

    @Value("${config.password}")
    private String password;
}

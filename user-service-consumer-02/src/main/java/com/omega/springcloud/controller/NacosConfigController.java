package com.omega.springcloud.controller;

import com.omega.springcloud.config.NacosConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/consumer/nacos")
public class NacosConfigController {

    @Autowired
    private NacosConfig nacosConfig;

    @GetMapping("/getNacosConfig")
    public Map<String, String> getNacosConfig() {
        Map<String, String> map = new HashMap<>();
        map.put("username", nacosConfig.getUsername());
        map.put("password", nacosConfig.getPassword());
        return map;
    }
}

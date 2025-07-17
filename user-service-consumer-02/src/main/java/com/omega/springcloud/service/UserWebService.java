package com.omega.springcloud.service;

import com.omega.springcloud.entity.Result;
import com.omega.springcloud.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

// @FeignClient(name = "userWebService", url = "http://localhost:8083", path = "/provider/user")
@FeignClient(name = "user-service-provider", path = "/provider/user")  // 这里指定服务生产者在注册中心上的别名
@Service
public interface UserWebService {

    /**
     * 1. 直接将 服务生产者 Controller 层的接口复制过来即可.
     * 2. OpenFeign 会自动根据负责均衡算来决定调用哪个 服务生产者 实例.
     */
    @GetMapping("/query/{id}")
    Result<User> query(@PathVariable("id") Long id);

    @PostMapping("/save")
    Result<Object> save(@RequestBody User user);
}
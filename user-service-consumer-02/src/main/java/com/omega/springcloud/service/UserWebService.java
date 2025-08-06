package com.omega.springcloud.service;

import com.omega.springcloud.entity.Result;
import com.omega.springcloud.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

// @FeignClient(name = "userWebService", url = "${feign-client.user-service-url}")
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


    /**
     * 方式一: 在 @RequestMapping 注解中的 headers 属性中设置
     */
    @GetMapping(value = "/find/{id}", headers = {"X-Key=111111"})
    Result<User> findWithRequestHeader1(@PathVariable("id") Long id);

    /**
     * 方式二: 使用 @RequestHeader 注解
     */
    @GetMapping(value = "/find/{id}")
    Result<User> findWithRequestHeader2(@PathVariable("id") Long id,
                                        @RequestHeader("X-Key") String key);

    @GetMapping(value = "/find/{id}")
    Result<User> findWithRequestHeader22(@PathVariable("id") Long id,
                                         @RequestHeader MultiValueMap<String, String> headers);


    /**
     * 方式三: 实现 RequestInterceptor 接口（拦截器）
     */
    @GetMapping(value = "/find/{id}")
    Result<User> findWithRequestHeader3(@PathVariable("id") Long id);

}
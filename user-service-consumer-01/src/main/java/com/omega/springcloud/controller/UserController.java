package com.omega.springcloud.controller;

import com.omega.springcloud.entity.Result;
import com.omega.springcloud.entity.User;
import com.omega.springcloud.service.UserWebService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/consumer/user")
public class UserController {

    // private static final String USER_SERVICE_PROVIDER_URL = "http://localhost:8081";

    // USER-SERVICE-PROVIDER 就是 服务提供方(集群) 注册到 Eureka Server 的名称(注意要大写), 服务消费者可以通过这个名称找到对应的主机名和端口号.
    /*private static final String USER_SERVICE_PROVIDER_URL = "http://USER-SERVICE-PROVIDER";

    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("/query/{id}")
    public Result query(@PathVariable("id") Long id) {
        log.info("消费者01 接收到的 id = {}", id);
        String url = USER_SERVICE_PROVIDER_URL + "/provider/user/query/" + id;
        return restTemplate.getForObject(url, Result.class);
    }

    @RequestMapping("/save")
    public Result save(@RequestBody User user) {
        log.info("消费者01 接收到的 user = {}", user);
        String url = USER_SERVICE_PROVIDER_URL + "/provider/user/save";
        return restTemplate.postForObject(url, user, Result.class);
    }*/

    @Autowired
    private UserWebService userWebService;

    @RequestMapping("/query/{id}")
    public Result query(@PathVariable("id") Long id) {
        log.info("消费者01 接收到的 id = {}", id);
        return userWebService.query(id);
    }

    @RequestMapping("/save")
    public Result save(@RequestBody User user) {
        log.info("消费者01 接收到的 user = {}", user);
        return userWebService.save(user);
    }
}

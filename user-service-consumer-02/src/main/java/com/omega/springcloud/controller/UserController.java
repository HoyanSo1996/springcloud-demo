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

    // user-service-provider 就是服务提供方注册到 Nacos Server 的名称 (要和配置文件里的服务名大小写保持一致).
    /*private static final String USER_SERVICE_PROVIDER_URL = "http://user-service-provider";

    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("/query/{id}")
    public Result query(@PathVariable("id") Long id) {
        log.info("消费者02 接收到的 id = {}", id);
        String url = USER_SERVICE_PROVIDER_URL + "/provider/user/query/" + id;
        return restTemplate.getForObject(url, Result.class);
    }

    @RequestMapping("/save")
    public Result save(@RequestBody User user) {
        log.info("消费者02 接收到的 user = {}", user);
        String url = USER_SERVICE_PROVIDER_URL + "/provider/user/save";
        return restTemplate.postForObject(url, user, Result.class);
    }*/

    @Autowired
    private UserWebService userWebService;

    @RequestMapping("/query/{id}")
    public Result query(@PathVariable("id") Long id) {
        log.info("消费者02 接收到的 id = {}", id);
        return userWebService.query(id);
    }

    @RequestMapping("/save")
    public Result save(@RequestBody User user) {
        log.info("消费者02 接收到的 user = {}", user);
        return userWebService.save(user);
    }

    @RequestMapping("/find/{id}")
    public Result find(@PathVariable("id") Long id) {
        log.info("消费者02 接收到的 id = {}", id);
        // return userWebService.findWithRequestHeader1(id);
        // return userWebService.findWithRequestHeader2(id, "222222");
        // LinkedMultiValueMap<String, String> map = new LinkedMultiValueMap<>();
        // map.add("X-Key", "222222222222");
        // return userWebService.findWithRequestHeader22(id, map);
        return userWebService.findWithRequestHeader3(id);
    }
}

package com.omega.springcloud.controller;

import com.omega.springcloud.entity.Result;
import com.omega.springcloud.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/consumer/user")
public class UserController {
    private static List<String> targetPortList = Arrays.asList("8083", "8084");

    private static int count = 0;

    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("/query/{id}")
    public Result query(@PathVariable("id") Long id) {
        log.info("消费者02 接收到的 id = {}", id);
        String url = "http://localhost:" + targetPortList.get(count++ % targetPortList.size()) + "/provider/user/query/" + id;
        return restTemplate.getForObject(url, Result.class);
    }

    @RequestMapping("/save")
    public Result save(@RequestBody User user) {
        log.info("消费者02 接收到的 user = {}", user);
        String url = "http://localhost:"+ targetPortList.get(count++ % targetPortList.size()) +"/provider/user/save";
        return restTemplate.postForObject(url, user, Result.class);
    }
}

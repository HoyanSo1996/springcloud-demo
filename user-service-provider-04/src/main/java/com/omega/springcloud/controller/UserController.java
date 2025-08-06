package com.omega.springcloud.controller;

import com.omega.springcloud.entity.Result;
import com.omega.springcloud.entity.User;
import com.omega.springcloud.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/provider/user")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/query/{id}")
    public Result<User> query(@PathVariable("id") Long id) {
        log.info("生产者04 接收到的 id = {}", id);
        User user = userService.queryById(id);
        if (user != null) {
            return Result.success("user-service-provider-04 查询成功~", user);
        } else {
            return Result.error("402", "id = " + id + " 的用户不存在");
        }
    }

    @PostMapping("/save")
    public Result<Object> save(@RequestBody User user) {
        log.info("生产者04 接收到的 user = {}", user);
        Integer count = userService.save(user);
        if (count > 0) {
            return Result.success("user-service-provider-04 添加用户成功~", count);
        } else {
            return Result.error("401", "添加用户失败");
        }
    }


    @GetMapping("/find/{id}")
    public Result<User> findWithRequestHeader(@PathVariable("id") Long id, @RequestHeader Map<String, String> map) {
        log.info("生产者03 接收到的 id = {}", id);
        log.info("生产者03 接收到的 x-key = {}", map.get("x-key"));
        User user = userService.queryById(id);
        if (user != null) {
            return Result.success("user-service-provider-03 查询成功~", user);
        } else {
            return Result.error("402", "id = " + id + " 的用户不存在");
        }
    }
}

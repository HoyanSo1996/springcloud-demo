package com.omega.springcloud.service.impl;

import com.omega.springcloud.entity.User;
import com.omega.springcloud.mapper.UserMapper;
import com.omega.springcloud.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User queryById(Long id) {
        return userMapper.selectById(id);
    }

    @Override
    public Integer save(User user) {
        return userMapper.insert(user);
    }
}

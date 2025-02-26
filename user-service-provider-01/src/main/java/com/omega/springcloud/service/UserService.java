package com.omega.springcloud.service;

import com.omega.springcloud.entity.User;

public interface UserService {

    User queryById(Long id);

    Integer save(User user);
}
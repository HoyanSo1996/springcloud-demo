package com.omega.springcloud.mapper;

import com.omega.springcloud.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    User selectById(@Param("id") Long id);

    Integer insert(User member);
}

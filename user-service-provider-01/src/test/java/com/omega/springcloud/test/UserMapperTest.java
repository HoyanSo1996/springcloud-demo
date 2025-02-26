package com.omega.springcloud.test;

import com.omega.springcloud.entity.User;
import com.omega.springcloud.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelectById() {
        User user = userMapper.selectById(1L);
        System.out.println("user = " + user);
    }

    @Test
    public void testInsert() {
        User user = new User(null, "John", "123",
                "13213213213", "John@163.com", 1);
        Integer count = userMapper.insert(user);
        System.out.println(count > 0 ? "数据插入成功" : "数据插入失败");
    }
}

package com.allweing.test;

import com.allweing.mapper.UserMapper;
import com.allweing.pojo.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @auther: zzzgyu
 */

public class Test {

    @org.junit.jupiter.api.Test
    public void query() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserMapper userMapper = applicationContext.getBean(UserMapper.class);
        User user = userMapper.findCustomerById(1l);

        System.out.println(user);


    }
}

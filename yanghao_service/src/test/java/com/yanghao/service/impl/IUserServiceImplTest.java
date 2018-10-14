package com.yanghao.service.impl;

import com.yanghao.domain.User;
import com.yanghao.respository.IUserRespository;
import com.yanghao.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/*2018/10/14 0014
   杨浩*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext_spring.xml")
public class IUserServiceImplTest {

    @Autowired
    private IUserService userService;

    @Test
    public void findAll() throws Exception {
        List<User> userList = userService.findAll();
        System.out.println(userList);
    }
}
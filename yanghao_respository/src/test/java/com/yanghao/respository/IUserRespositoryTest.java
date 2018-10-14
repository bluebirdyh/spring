package com.yanghao.respository;

import com.yanghao.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/*2018/10/14 0014
   杨浩*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext_mybatis.xml")
public class IUserRespositoryTest {

    @Autowired
    private IUserRespository userRespository;
    @Test
    public void findAll() throws Exception{
        List<User> userList = userRespository.findAll();
        System.out.println(userList);
    }
}
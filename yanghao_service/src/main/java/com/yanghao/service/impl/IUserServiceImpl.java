package com.yanghao.service.impl;

import com.yanghao.domain.User;
import com.yanghao.respository.IUserRespository;
import com.yanghao.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/*2018/10/14 0014
   杨浩*/
@Service("userService")
@Transactional
public class IUserServiceImpl implements IUserService {

    @Autowired
    private IUserRespository userRespository;

    @Override
    public List<User> findAll() throws Exception{
        return userRespository.findAll();
    }
}

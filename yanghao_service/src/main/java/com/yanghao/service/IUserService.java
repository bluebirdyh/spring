package com.yanghao.service;

import com.yanghao.domain.User;

import java.util.List;

/*2018/10/14 0014
   杨浩*/
public interface IUserService {

    List<User> findAll() throws Exception;
}

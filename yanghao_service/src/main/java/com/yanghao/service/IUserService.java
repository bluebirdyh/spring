package com.yanghao.service;

import com.yanghao.domain.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

/*2018/10/14 0014
   杨浩*/
public interface IUserService extends UserDetailsService {

    List<User> findAll() throws Exception;
}

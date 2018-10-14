package com.yanghao.web.controller;

import com.yanghao.domain.User;
import com.yanghao.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/*2018/10/14 0014
   杨浩*/
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/findAll")
    public ModelAndView findAll() throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("users");
        List<User> userList = userService.findAll();
        modelAndView.addObject("userList",userList);
        return modelAndView;
    }
}


package com.itnao.controller;

import com.itnao.model.User;
import com.itnao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by 凯 on 2016/11/10.
 */
@Controller
@RequestMapping(value = "User")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "getUser")
    public String getUser(){
        List<User> list = userService.findUser();
        for (User u:list){
            System.out.println(u);
        }
        return "success";
    }

}

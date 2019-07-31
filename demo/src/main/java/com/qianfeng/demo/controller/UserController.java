package com.qianfeng.demo.controller;

import com.qianfeng.demo.entity.User;
import com.qianfeng.demo.resource.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private Resource resource;


    @RequestMapping("hello")
    public String test1(){
        return "hello";
    }

    @RequestMapping("show")
    public User test2(String name,String pwd){
        User user=new User();
        user.setDate(new Date());
        user.setName(name);
        user.setPwd(pwd);
        return user;
    }

    @RequestMapping("resource")
    public String test3(){
        return resource.getEmailServer()+":"+resource.getImageServer();
    }

}

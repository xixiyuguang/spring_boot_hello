package com.yg.controller;

import com.yg.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @RestController  相当于 @Controller和@ResponseBody
 */
@RestController
//@Controller
public class HelloController1 {

    @RequestMapping("/hello")
    //@ResponseBody
    public String hello(){
        return "hell22222222222222222222222222222211o";
    }

    @RequestMapping("user")
    public User getUser(){
        User user = new User();
        user.setId(1);
        user.setName("于光");
        user.setCreateTime(new Date());
        user.setRemark("您是傻逼吗");
        return  user;
    }
    @RequestMapping("/hello1")
    public String hello1(){
        return "h";
    }

    @RequestMapping("/hello2")
    public String hello2(){
        return "h211111";
    }

    @RequestMapping("/hello3")
    public String hello3(){
        return "h311111";
    }



}

package com.zyj.controller;

import com.zyj.bean.User;
import com.zyj.service.UserService;
import com.springmvc.annotation.AutoWired;
import com.springmvc.annotation.Controller;
import com.springmvc.annotation.RequestMapping;
import com.springmvc.annotation.ResponseBody;

/**
 * @author zyj
 */
@Controller
public class UserController {

       @AutoWired(value="userService")
       private UserService userService;


       //定义方法
       @RequestMapping("/findUser")
       public  String  findUser(String name){
           //调用服务层
           userService.findUser();
           return "forward:/success.jsp";
       }

    @RequestMapping("/getData")
    @ResponseBody  //返回json格式的数据
    public User getData(){
        //调用服务层
        return userService.getUser();
    }
}

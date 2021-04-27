package com.zyj.service.impl;

import com.zyj.bean.User;
import com.zyj.service.UserService;
import com.springmvc.annotation.Service;

/**
 * @author zyj
 */
@Service(value="userService")
public class UserServiceImpl implements UserService {

    @Override
    public  void  findUser(){
        System.out.println("====调用UserServiceImpl==findUser===");
    }
    @Override
    public User getUser(){

       return new User(1,"老王","admin");
    }

}

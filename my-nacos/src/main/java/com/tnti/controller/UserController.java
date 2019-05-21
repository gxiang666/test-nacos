package com.tnti.controller;

import com.tnti.dao.UserDao;
import com.tnti.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserDao userDao;

    //http://localhost:9090/list
    //http://localhost:9090/actuator/nacos-discovery
    @RequestMapping("/list")
    public List<User> list(){
        return userDao.list();
    }
}


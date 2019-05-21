package com.tnti.controller;

import com.tnti.dao.UserDao;
import com.tnti.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api("用户")
public class UserController {

    @Autowired
    UserDao userDao;

    //http://localhost:9090/list
    //http://localhost:9090/actuator/nacos-discovery
    @ApiOperation(value = "查询使用")
    @GetMapping("/list")
    public List<User> list(){
        return userDao.list();
    }
}


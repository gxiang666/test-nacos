package com.tnti.controller;

import com.tnti.service.User;
import com.tnti.service.UserClientService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(value = "消费者")
public class ComsumerController {

    @Autowired
    private UserClientService userClientService;

    @ApiOperation(value = "消费者请求")
    @RequestMapping("/consumer/list")
    public List<User> list() {
        return userClientService.list();
    }
}

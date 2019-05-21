package com.tnti.controller;

import com.tnti.service.User;
import com.tnti.service.UserClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ComsumerController {

    @Autowired
    private UserClientService userClientService;

    @RequestMapping("/consumer/list")
    public List<User> list() {
        return userClientService.list();
    }
}

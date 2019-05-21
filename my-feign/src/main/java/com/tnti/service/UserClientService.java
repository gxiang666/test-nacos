package com.tnti.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(value = "mynacos")
@Component
public interface UserClientService {

    @RequestMapping("/list")
    public List<User> list();
}

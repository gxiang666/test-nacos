package com.tnti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GatewayApplication {

    //http://localhost:8001/testnacos/list
    //http://localhost:9090/list
    public static void main(String[] args){
        SpringApplication.run(GatewayApplication.class, args);
    }
}

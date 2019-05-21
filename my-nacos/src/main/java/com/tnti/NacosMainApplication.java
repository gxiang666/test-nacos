package com.tnti;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.tnti")
@EnableDiscoveryClient
@EnableSwagger2
public class NacosMainApplication {

    public static void main(String[] args){
        SpringApplication.run(NacosMainApplication.class, args);
    }
}

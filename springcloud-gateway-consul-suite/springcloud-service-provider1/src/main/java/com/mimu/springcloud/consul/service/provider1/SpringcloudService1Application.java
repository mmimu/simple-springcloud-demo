package com.mimu.springcloud.consul.service.provider1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringcloudService1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudService1Application.class, args);
    }
}

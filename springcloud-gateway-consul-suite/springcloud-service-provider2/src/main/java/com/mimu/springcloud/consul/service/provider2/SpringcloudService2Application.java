package com.mimu.springcloud.consul.service.provider2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringcloudService2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudService2Application.class, args);
    }
}

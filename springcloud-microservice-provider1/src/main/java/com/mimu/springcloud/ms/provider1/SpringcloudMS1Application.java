package com.mimu.springcloud.ms.provider1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringcloudMS1Application {
    public static void main(String[] args) {
        SpringApplication.run(SpringcloudMS1Application.class, args);
    }
}

package com.mimu.springcloud.consul.gateway.servcie.suite;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudGatewayServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudGatewayServiceApplication.class, args);
    }
}

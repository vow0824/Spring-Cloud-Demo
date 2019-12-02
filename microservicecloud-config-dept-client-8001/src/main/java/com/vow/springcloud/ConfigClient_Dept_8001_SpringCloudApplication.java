package com.vow.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class ConfigClient_Dept_8001_SpringCloudApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClient_Dept_8001_SpringCloudApplication.class, args);
    }
}

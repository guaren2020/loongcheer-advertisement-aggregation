package com.loongcheer.advertisement.admanagement;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//@EnableEurekaClient 和 @EnableDiscoveryClient 都是让eureka发现该服务并注册到eureka上的注解
//相同点：都能让注册中心Eureka发现，并将该服务注册到注册中心上；
//不同点：@EnableEurekaClient只适用于Eureka作为注册中心，而@EnableDiscoveryClient可以是其他注册中心；
@EnableEurekaClient
@MapperScan("com.loongcheer.advertisement.admanagement.mapper")
public class AdmanagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdmanagementApplication.class, args);
    }

}

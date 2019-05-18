package com.kn.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ Author:kn
 * @ Description:
 * @ Date:Created in 2019/4/18 18:16
 * @ Modified By:
 */
@EnableEurekaClient
@SpringBootApplication
public class Order8102Application {
    public static void main(String[] args) {
        SpringApplication.run(Order8102Application.class,args);
    }
}

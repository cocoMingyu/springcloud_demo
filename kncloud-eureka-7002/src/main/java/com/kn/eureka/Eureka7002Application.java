package com.kn.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ Author:kn
 * @ Description:
 * @ Date:Created in 2019/4/19 14:41
 * @ Modified By:
 */
@EnableEurekaServer
@SpringBootApplication
public class Eureka7002Application {
    public static void main(String[] args) {
        SpringApplication.run(Eureka7002Application.class,args);
    }
}

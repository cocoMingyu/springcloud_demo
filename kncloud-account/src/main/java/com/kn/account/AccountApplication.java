package com.kn.account;

import com.kn.account.config.MySelfRule;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @ Author:kn
 * @ Description:
 * @ Date:Created in 2019/4/17 20:06
 * @ Modified By:
 */
@MapperScan("com.kn.account.mapper")
@EnableAsync
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "order",configuration = MySelfRule.class)//开启ribbon负载均衡,指定负载均衡配置类
@EnableFeignClients(basePackages = "com.kn.account")//开启feign
@EnableCircuitBreaker//开启hystrix断路器
public class AccountApplication {
    public static void main(String[] args) {
        SpringApplication.run(AccountApplication.class,args);
    }
}

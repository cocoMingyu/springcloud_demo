package com.kn.account.config;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ Author:kn
 * @ Description:
 * @ Date:Created in 2019/4/22 12:03
 * @ Modified By:
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule iRule(){
        return new CustomIRule();
    }
}

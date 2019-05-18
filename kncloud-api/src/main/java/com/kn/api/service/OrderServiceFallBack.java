package com.kn.api.service;

import com.kn.api.entity.Orders;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @ Author:kn
 * @ Description:
 * @ Date:Created in 2019/4/22 16:47
 * @ Modified By:
 */
public class OrderServiceFallBack implements FallbackFactory<OrderService> {
    @Override
    public OrderService create(Throwable throwable) {
        return new OrderService() {
            @Override
            public Orders getOrder(long orderno) {
                return Orders.builder().address("服务挂了").build();
            }
        };
    }
}

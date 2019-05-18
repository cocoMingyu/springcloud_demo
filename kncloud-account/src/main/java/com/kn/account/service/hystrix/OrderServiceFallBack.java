package com.kn.account.service.hystrix;

import com.kn.account.service.feign.OrderService;
import com.kn.api.entity.Orders;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
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

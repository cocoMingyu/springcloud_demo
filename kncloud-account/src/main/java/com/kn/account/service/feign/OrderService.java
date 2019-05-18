package com.kn.account.service.feign;

import com.kn.account.service.hystrix.OrderServiceFallBack;
import com.kn.api.entity.Orders;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @ Author:kn
 * @ Description:
 * @ Date:Created in 2019/4/22 15:20
 * @ Modified By:
 */
@FeignClient(name = "order",fallbackFactory = OrderServiceFallBack.class)
public interface OrderService {
    @GetMapping("/order/{orderno}")
    Orders getOrder(@PathVariable(value = "orderno") long orderno);
}

package com.kn.order.controller;

import com.kn.order.entity.Orders;
import com.kn.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Author:kn
 * @ Description:
 * @ Date:Created in 2019/4/17 21:27
 * @ Modified By:
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @GetMapping("/{orderno}")
    public Orders getOrder(@PathVariable long orderno){
        return orderService.getOrderByOrderno(orderno);
    }
}

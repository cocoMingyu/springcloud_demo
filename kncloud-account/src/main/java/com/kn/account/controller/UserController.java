package com.kn.account.controller;

import com.kn.account.entity.User;
import com.kn.account.service.UserService;
import com.kn.account.service.feign.OrderService;
import com.kn.api.entity.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Author:kn
 * @ Description:
 * @ Date:Created in 2019/4/17 20:02
 * @ Modified By:
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private OrderService orderService;
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Integer id){
        return userService.selectUserById(id);
    }

    @GetMapping("/getorder/{orderno}")
    public Orders getOrder(@PathVariable Long orderno){
        Orders order = orderService.getOrder(orderno);
        return order;
    }
}

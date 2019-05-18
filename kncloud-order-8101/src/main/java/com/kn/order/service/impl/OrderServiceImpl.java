package com.kn.order.service.impl;

import com.kn.order.entity.Orders;
import com.kn.order.mapper.OrderExtMapper;
import com.kn.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ Author:kn
 * @ Description:
 * @ Date:Created in 2019/4/22 9:55
 * @ Modified By:
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderExtMapper orderExtMapper;

    @Override
    public Orders getOrderByOrderno(long orderno){
        Orders order = orderExtMapper.getOrderByOrderno(orderno);
        return order;
    }
}

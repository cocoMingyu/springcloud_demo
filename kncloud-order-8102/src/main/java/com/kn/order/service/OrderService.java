package com.kn.order.service;

import com.kn.order.entity.Orders;

/**
 * @ Author:kn
 * @ Description:
 * @ Date:Created in 2019/4/22 9:54
 * @ Modified By:
 */
public interface OrderService {
    Orders getOrderByOrderno(long orderno);
}

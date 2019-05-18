package com.kn.order.mapper;

import com.kn.order.entity.Orders;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @ Author:kn
 * @ Description:
 * @ Date:Created in 2019/4/22 9:52
 * @ Modified By:
 */
@Mapper
public interface OrderExtMapper {
    @Select("select * from orders where orderno=#{orderno}")
    Orders getOrderByOrderno(@Param("orderno")long orderno);
}

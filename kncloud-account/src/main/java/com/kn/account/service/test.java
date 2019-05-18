package com.kn.account.service;

import ch.qos.logback.core.joran.util.beans.BeanUtil;
import com.kn.account.entity.User;
import org.springframework.beans.BeanUtils;
import org.springframework.cglib.beans.BeanMap;

import java.util.HashMap;
import java.util.Map;

/**
 * @ Author:kn
 * @ Description:
 * @ Date:Created in 2019/5/15 11:39
 * @ Modified By:
 */
public class test {
    public static void main(String[] args) {
        User user=new User();
        user.setId(1111);
        user.setName("kn");
        Map<String, Object> map = new HashMap<>();
        map.put("nickname","knn");
        BeanMap beanMap = BeanMap.create(User.class);
        beanMap.putAll(map);
        BeanUtils.copyProperties(beanMap,user);
        System.out.println(user.toString());
    }
}

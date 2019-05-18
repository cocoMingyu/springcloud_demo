package com.kn.account.service.impl;

import com.kn.account.entity.User;
import com.kn.account.mapper.UserMapper;
import com.kn.account.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ Author:kn
 * @ Description:
 * @ Date:Created in 2019/4/17 20:01
 * @ Modified By:
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User selectUserById(Integer id) {
        return userMapper.selectUserById(id);
    }
}

package com.kn.account.service;

import com.kn.account.entity.User;

/**
 * @ Author:kn
 * @ Description:
 * @ Date:Created in 2019/4/17 19:59
 * @ Modified By:
 */
public interface UserService {
    User selectUserById(Integer id);
}

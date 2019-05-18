package com.kn.account.mapper;

import com.kn.account.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @ Author:kn
 * @ Description:
 * @ Date:Created in 2019/4/17 19:58
 * @ Modified By:
 */
@Mapper
public interface UserMapper {
    @Select("select * from user where id=#{id}")
    User selectUserById(@Param("id") Integer id);
}

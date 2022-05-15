package com.dantegg.shop.repository;

import com.dantegg.shop.bean.User;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    @Select("select * from ec_user where login_name = #{loginName}")
    User login(String loginName);
}
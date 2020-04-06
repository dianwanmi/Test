package com.itheima.mapper;

import com.itheima.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


import java.util.List;

/**
 * @author ：
 * @date ：Created in 2020/3/17
 * @description ：
 * @version: 1.0
 */
@Mapper
public interface UserMapper {
    @Select("select * from user;")
    public List<User> findAll();
}

package com.itheima.sevice;

import com.itheima.pojo.User;

import java.util.List;

/**
 * @author ：
 * @date ：Created in 2020/3/17
 * @description ：
 * @version: 1.0
 */
public interface UserService {
    List<User> findAll();
}

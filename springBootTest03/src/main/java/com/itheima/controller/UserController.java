package com.itheima.controller;

import com.itheima.pojo.User;
import com.itheima.sevice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Max;
import java.util.List;

/**
 * @author ：
 * @date ：Created in 2020/3/17
 * @description ：
 * @version: 1.0
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private RedisTemplate redisTemplate;
    @RequestMapping("user")
    public List<User> user(){
//        return userService.findAll();
        String key = userService.getClass().getName() + "user";
        List<User> users = (List<User>) redisTemplate.boundValueOps(key).get();
        if (users == null){
            users = userService.findAll();
            redisTemplate.boundValueOps(key).set(users);
            System.out.println("数据库获取");
        }else {
            System.out.println("redis获取");
        }
        return users;
    }
}

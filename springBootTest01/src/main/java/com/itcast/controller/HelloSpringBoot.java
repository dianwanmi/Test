package com.itcast.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：
 * @date ：Created in 2020/3/16
 * @description ：
 * @version: 1.0
 */
@RestController
public class HelloSpringBoot {
    @RequestMapping("hello")
    public String hello(){
        return "springBoot hello!";
    }
}

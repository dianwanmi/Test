package com.itheima.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;

/**
 * @author ：
 * @date ：Created in 2020/3/16
 * @description ：
 * @version: 1.0
 */
@RestController
public class SpringBoot02Test {
    @RequestMapping("hello")
    public String hello() throws FileNotFoundException {
        return "springBoot hello!333346444";
    }
}

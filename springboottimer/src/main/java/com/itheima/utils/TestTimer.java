package com.itheima.utils;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author ：
 * @date ：Created in 2020/3/17
 * @description ：
 * @version: 1.0
 */
@Component
public class TestTimer {

    @Scheduled(cron = "0/5 * * * * ? ")
    public void timerTest(){
        System.out.println(new Date());
    }
}

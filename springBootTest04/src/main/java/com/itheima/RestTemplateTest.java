package com.itheima;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author ：
 * @date ：Created in 2020/3/18
 * @description ：
 * @version: 1.0
 */
@RestController
public class RestTemplateTest {
    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping("send")
    public String Test(){
        String forObject = restTemplate.getForObject("http://baidu.com/", String.class);
        System.out.println(forObject);
        return forObject;
    }
}

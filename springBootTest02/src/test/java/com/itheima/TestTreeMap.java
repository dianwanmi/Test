package com.itheima;

import com.itheima.controller.SpringBoot02Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

/**
 * @author ：
 * @date ：Created in 2020/3/30
 * @description ：
 * @version: 1.0
 */
public class TestTreeMap {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();
        treeMap.put("a",1);
        treeMap.put("b",4);
        treeMap.put("c",3);
        Set<Map.Entry<String, Integer>> entries = treeMap.entrySet();
        List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(entries);
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        for (Map.Entry<String, Integer> stringIntegerEntry : list) {
            System.out.println(stringIntegerEntry.getKey()+stringIntegerEntry.getValue());
        }
    }
}

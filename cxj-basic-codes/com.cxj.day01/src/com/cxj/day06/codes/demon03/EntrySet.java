package com.cxj.day06.codes.demon03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class EntrySet {
    public static void main(String[] args) {
        Map<String,Integer> one = new HashMap<>();
        one.put("赵丽颖",170);
        one.put("陈钰琪",165);
        one.put("祝绪丹",167);
        one.put("周星驰",170);
        one.put("成龙",180);
        System.out.println( "初始化map: " + one);
        System.out.println("------------------");

        //创建entry将map放入
        Set<Map.Entry<String, Integer>> two = one.entrySet();

        //利用迭代器进行遍历输出
        Iterator<Map.Entry<String, Integer>> three = two.iterator();
        while(three.hasNext()){
            Map.Entry<String, Integer> entry = three.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println( key + "=" + value);
        }
        System.out.println("------------------");

        //利用增强for循环进行遍历输出
        for (Map.Entry<String, Integer> entry: two){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println( key + "=" + value);
        }
    }
}

package com.cxj.day06.codes.demon03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class keySet {

    public static void main(String[] args) {
        //创建map集合
        Map<String, Integer> one = new HashMap<>();
        one.put("赵丽颖",168);
        one.put("陈钰琪",165);
        one.put("祝绪丹",167);
        one.put("李丽珍",170);

        //将map集合中的key放进set集合中
        Set<String> two = one.keySet();
        //第一种方式遍历输出-----迭代器
        Iterator<String> it = two.iterator();
        while(it.hasNext()){
            String key = it.next();
            Integer value = one.get(key);
            System.out.println(key + "=" + value);
        }
        System.out.println("------------------");
        //第二种方式遍历输出-----增强for循环
        for (String key: two) {
            Integer value = one.get(key);
            System.out.println(key + "=" + value);
        }
    }

}

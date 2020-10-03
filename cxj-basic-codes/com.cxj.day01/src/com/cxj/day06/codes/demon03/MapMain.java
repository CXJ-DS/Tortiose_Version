package com.cxj.day06.codes.demon03;

import java.util.HashMap;
import java.util.Map;

public class MapMain {

    public static void main(String[] args) {
        Method01();
    }

    private static void Method01() {

        Map<String,Integer> one = new HashMap<>();
        one.put("赵丽颖",168);
        one.put("陈钰琪",165);
        one.put("祝绪丹",167);
        one.put("李丽珍",170);

        System.out.println(one);
        //删除key对应的value值以及key
        Integer num = one.remove("李丽珍");
        System.out.println("删除后的value:" + num);
        //检查是否存在key对应的value值
        boolean key = one.containsKey("陈钰琪");
        System.out.println("是否存在" + key);
        //get(key)输出key对应的value值
        Integer zly = one.get("赵丽颖");
        System.out.println(zly);
        System.out.println(one.get("陈钰琪"));
    }

}

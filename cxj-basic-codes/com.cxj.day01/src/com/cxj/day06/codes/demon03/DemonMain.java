package com.cxj.day06.codes.demon03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DemonMain {
    public static void main(String[] args) {
       Method01();
    }

    private static void Method01() {
        Map<Person,String> map = new HashMap<>();
        map.put(new Person("陈先俊",23),"贵州");
        map.put(new Person("张三",19),"浙江");
        map.put(new Person("李四",34), "河南");
        map.put( new Person("王五",45) ,"北京");
        map.put( new Person("王五",45) ,"西藏");
        System.out.println("初始化map: " + map);
        System.out.println("--------------------");
        Set<Map.Entry<Person, String>> entry = map.entrySet();
        Iterator<Map.Entry<Person, String>> it = entry.iterator();
        while(it.hasNext()){
            Map.Entry<Person, String> next = it.next();
            Person key = next.getKey();
            String value = next.getValue();
            System.out.println( key+ "------" + value);
        }
        System.out.println("--------------------");

        for (Map.Entry<Person,String> next: entry){
            Person key = next.getKey();
            String value = next.getValue();
            System.out.println( key+ "------" + value);
        }
    }

    private static void Method() {
        Map<String,Person> map = new HashMap<>();
        map.put("贵州", new Person("陈先俊",23));
        map.put("浙江", new Person("张三",19));
        map.put("河南", new Person("李四",34));
        map.put("北京", new Person("王五",45));
        System.out.println("初始化map: " + map);
        System.out.println("--------------------");
        Set<String> set = map.keySet();
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            String key = it.next();
            Person value = map.get(key);
            System.out.println(key + "---" + value);
        }
        System.out.println("--------------------");

        for (String key: set) {
            Person value = map.get(key);
            System.out.println(key + "---" + value);
        }
    }
}

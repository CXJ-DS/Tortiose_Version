package com.cxj.day02.codes.demon03;

/*
arrayList的一些常用方法
向集合里添加 add();
从集合里拿出 get();
删除集合里的元素 remove();
集合的长度大小 size();
 */

import java.util.ArrayList;

public class demon03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> one = new ArrayList<>();
        one.add("赵丽颖");
        one.add("冯绍峰");
        one.add("陈晓");
        boolean add = one.add("柳岩");
        System.out.println("是否添加成功:"  + add);
        System.out.println(one);

        System.out.println("-----------------------");
        //删除指定元素
        String removeWho = one.remove(2);
        System.out.println("集合中被删除的元素:" + removeWho);
        System.out.println(one);
        //集合中指定位置新元素替代旧元素
        String sett = one.set(1, "陈伟霆");
        System.out.println("集合中替代的元素:" + sett);
        System.out.println(one);
        //遍历查询集合元素
        for (int i = 0; i < one.size(); i++) {
            System.out.println(one.get(i));//获取集合指定位置元素
        }
    }
}

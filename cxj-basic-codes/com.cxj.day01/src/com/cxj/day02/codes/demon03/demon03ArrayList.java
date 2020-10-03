package com.cxj.day02.codes.demon03;

import java.util.ArrayList;

public class demon03ArrayList {
    public static void main(String[] args) {
        //创建 其中<>中是集合的类型 在jdk1.6之后 右边的<>中不用再重复集合的类型
        //<>中为引用类型泛型，不能为基本类型
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        list.add("赵丽颖");
        System.out.println(list);

        list.add("迪丽热巴");
        list.add("古力娜扎");
        list.add("陈晓");
        System.out.println(list);
    }
}

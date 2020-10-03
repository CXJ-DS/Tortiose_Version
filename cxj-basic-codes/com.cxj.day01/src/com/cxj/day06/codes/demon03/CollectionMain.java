package com.cxj.day06.codes.demon03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionMain {

    public static void main(String[] args) {
        Collection<String> str = new ArrayList<>();
        str.add("赵丽颖");
        str.add("麦迪");
        str.add("科比");
        str.add("艾弗森");
        str.add("卡特");
        System.out.println(str);
        System.out.println("-------------------");
        Iterator<String> it = str.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }

}

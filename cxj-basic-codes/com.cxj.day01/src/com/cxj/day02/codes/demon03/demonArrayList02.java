package com.cxj.day02.codes.demon03;

import java.util.ArrayList;

/*ArrayList中基本类型的表现方式
基本类型   包装类型
byte       Byte
short      Short
int        Integer   【重点】
long       Long
float      Float
double     Double
char       Character   【重点】
boolean    Boolean
注意事项：从jdk1.5+开始  实现了ArrayList的基本类型和包装类型的自动转化
*/
public class demonArrayList02 {
    public static void main(String[] args) {
        //常见的引用类型ArrayList
        ArrayList<String> str = new ArrayList<>();
        //基本类型的ArrayList
        ArrayList<Integer> strA = new ArrayList<>();
        strA.add(100);
        strA.add(200);
        System.out.println("集合中第二个元素:" + strA.get(1));
    }
}

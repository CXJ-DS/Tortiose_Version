package com.cxj.day03.codes.demon01;

/*
String的三种创建方式(3+1)
'==' 对于基本类型，比较的是内容；对于引用类型，例如String，比较的是地址值
如果要比较引用类型的内容时，必须使用equals进行对比。
【注意事项】 数组内容一旦确定，将不能随意更改
*/
public class demon01StringEquals {
    public static void main(String[] args) {
        //第一种方式，直接创建
        String str1 = "abcd";
        System.out.println("第一个数组:" + str1);
        //第二种方式
        char[] charArray = new char[]{'a','b','c','d'};
        String str2 = new String(charArray);
        System.out.println("第二个数组:" + str2);
        //第三种方式创建
        byte[] ByteArray = new byte[]{ 97, 98, 99, 100};
        String str3 = new String(ByteArray);
        System.out.println("第三个数组:" + str3);
        //第四种创建方式
        String str4 = new String("abcd");
        System.out.println("第四个数组:" + str3);
        System.out.println("---------------------");

        System.out.println(str1 == str2);
        System.out.println(str2 == str3);
        System.out.println(str3 ==str4);
        System.out.println("---------------------");
        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals(str4));
        System.out.println(str1.equals(str4));
    }
}

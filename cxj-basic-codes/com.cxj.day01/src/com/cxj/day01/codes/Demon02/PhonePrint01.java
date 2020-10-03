package com.cxj.day01.codes.Demon02;

public class PhonePrint01 {
    public static void main(String[] args) {
//    成员变量创建
        Phone one = new Phone();
        one.name = "小米8";
        one.color = "深黑色";
        one.CPU = "晓龙810";
        one.price = 2699.9 ;
        Method(one);
        System.out.println("----------------");
    }
    public static void Method(Phone a){
        System.out.println(a.name);
        System.out.println(a.price);
        System.out.println(a.CPU);
        System.out.println(a.color);
    }
}

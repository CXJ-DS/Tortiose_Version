package com.cxj.day01.codes.Demon02;

public class PhonePrint {
    public static void main(String[] args) {
//    成员变量创建
        Phone phone = new Phone();
        System.out.println(phone.name);
        System.out.println(phone.color);
        System.out.println(phone.CPU);
        System.out.println(phone.price);
        System.out.println("----------------");

        phone.name = "小米8se";
        phone.color = "深黑色";
        phone.CPU = "晓龙710";
        phone.price = 1699.9 ;
        System.out.println(phone.name);
        System.out.println(phone.color);
        System.out.println(phone.CPU);
        System.out.println(phone.price + "元");
        System.out.println("----------------");

        phone.Call("赵丽颖");
        phone.sendMessage();
        phone.Game();
    }
}

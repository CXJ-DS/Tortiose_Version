package com.cxj.day01.codes.Demon02;

public class PhonePrint02 {
    public static void main(String[] args) {
//    成员变量创建
        Phone three = new Phone();
        System.out.println(three.name);
        System.out.println(three.color);
        System.out.println(three.CPU);
        System.out.println(three.price);
        System.out.println("----------------");

        three.name = "小米8";
        three.color = "深黑色";
        three.CPU = "晓龙810";
        three.price = 2699.9 ;
        System.out.println(three.name);
        System.out.println(three.color);
        System.out.println(three.CPU);
        System.out.println(three.price + "元");
        System.out.println("----------------");

        three.Call("赵丽颖");
        three.sendMessage();
        three.Game();
        System.out.println("----------------");

        Phone four = three;
        four.name = "小米2";
        four.color = "深黑色";
        four.CPU = "晓龙510";
        four.price = 699.9 ;
        System.out.println(four.name);
        System.out.println(four.color);
        System.out.println(four.CPU);
        System.out.println(four.price + "元");
        System.out.println("----------------");

        four.Call("欧巴");
        four.sendMessage();
        four.Game();
    }
}

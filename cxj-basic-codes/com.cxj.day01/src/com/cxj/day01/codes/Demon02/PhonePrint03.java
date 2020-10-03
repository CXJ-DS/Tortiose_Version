package com.cxj.day01.codes.Demon02;

public class PhonePrint03 {
    public static void main(String[] args) {
        Phone fives = getPhone();
        System.out.println(fives.name);
        System.out.println(fives.CPU);
        System.out.println(fives.price);
        System.out.println(fives.color);
    }
    public static Phone getPhone(){
        Phone six = new Phone();
        six.name = "小米9";
        six.CPU = "晓龙810";
        six.price = 5012.0;
        six.color = "尊贵金";
        return six;
    }
}

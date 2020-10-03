package com.cxj.day01.codes.DemonDay01;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello,World!");
        byte num1=100;
        byte num2=45;
        int result=num2 + num1;
        System.out.println(result);
        int max = num1 > num2 ? num1 : num2;
        System.out.println(max);
        char zifu1 = (char) num1;
        System.out.println(zifu1);
        char zifu2 = 'a';
        int num3 = (int) zifu2;
        System.out.println(num3+1);
    }
}

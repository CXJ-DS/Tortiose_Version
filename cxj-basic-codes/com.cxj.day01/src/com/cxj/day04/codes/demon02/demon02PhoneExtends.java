package com.cxj.day04.codes.demon02;

public class demon02PhoneExtends {
    public static void main(String[] args) {
        //旧手机
        OldPhone one = new OldPhone();
        one.call();
        one.sendMessage();
        one.show();
        System.out.println("-----------------");

        //新手机
        NewPhone two = new NewPhone();
        two.call();
        two.sendMessage();
        two.show();
    }
}

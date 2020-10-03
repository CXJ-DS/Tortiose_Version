package com.cxj.day02.codes.demon01;

import java.util.Scanner;

//匿名对象
//格式：new 类名称();
//注意事项：对于匿名对象的使用次数有仅只有一次，只适合那种只使用的对象一次的情况；
//如果要继续使用，就必须new一个
public class day03Scanner {
    public static void main(String[] args) {
//        标准格式
//        Person person = new Person();
//        Scanner scan = new Scanner(System.in);
//        String  s = scan.next();
//        person.name = s;
//        System.out.println("名字为：" + person.name);
//        匿名对象
        new Person().name = "赵丽颖";
        new Person().ShowName(); // 返回值为 null

        int a = new Scanner(System.in).nextInt();
        System.out.println("你输入的数字为:" + a);
    }
}

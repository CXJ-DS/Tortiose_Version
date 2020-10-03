package com.cxj.day02.codes.demon01;

import java.util.Scanner;
//1.导包
//2.创建
//  类名称  对象名 = new 类名称();
//  对于Scanner创建 Scanner sca = new Scanner(System.in);
//3.使用
// 对于基本类型的使用方式(int类型为例)： int 变量 = 对象名.nextInt();
// 对于调用类型的使用方式(String): String 变量 = 对象名.next();
public class day02Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("你输入的数字:" + a);
        String str = scanner.next();
        System.out.println("你输入的字符串为:" + str);
    }
}

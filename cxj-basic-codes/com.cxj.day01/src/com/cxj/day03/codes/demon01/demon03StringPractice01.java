package com.cxj.day03.codes.demon01;

import java.util.Scanner;

/*
题目描述:一个数组输入大小字母特殊符号，判断其中数字字母特殊符号都有多少个
1.创建数组，将数字、字母、特殊符号转入
2.调用方法，将String数组转换为char数组(字符数组)，进行遍历判断
3.输出各类个数
改进： 键盘输入数组
 */
public class demon03StringPractice01 {
    public static void main(String[] args) {
//        String str = "abcdfhjaskdfhisodsfABCDHGKJDASHGJKASDG<>{}!@#$%^&*()";
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        getString(str);
    }
    public static void getString(String str){
        int BigCase=0;
        int LowerCase = 0;
        int SpecialChar = 0;
        int number = 0;
        char[] charA = str.toCharArray();
        for (int i = 0; i < charA.length; i++) {
            if('a' <= charA[i] && charA[i] <= 'z'){
                LowerCase++;
            } else if ('A' <= charA[i] && charA[i] <= 'Z'){
                BigCase++;
            }else if('0' <= charA[i] && charA[i]<='9'){
                number++;
            }
            else {
                SpecialChar++;
            }
        }
        System.out.println("大写字母有: " + BigCase);
        System.out.println("小写字母有: " + LowerCase);
        System.out.println("数字有:" + number);
        System.out.println("特殊字符有: " + SpecialChar);
    }
}

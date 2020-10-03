package com.cxj.day02.codes.demon02;

import java.util.Random;
import java.util.Scanner;
/*
猜字游戏：进入循环的是每次输入的数值以及循环判断
最后猜对时候直接break;退出循环
*/
public class demon02Random {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(100) +1;
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("请输入你猜测使的数字：");
            int a = scan.nextInt();
            if(num > a){
                System.out.println("你输入的数字太小，请向重新尝试!");
            }else if(num < a){
                System.out.println("你输入的数字太大，请向重新尝试!");
            }else{
                System.out.println("恭喜你已猜中!");
                break;
            }
        }
        System.out.println("游戏结束!");
    }
}

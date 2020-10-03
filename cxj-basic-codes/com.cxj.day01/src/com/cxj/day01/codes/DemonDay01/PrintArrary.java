package com.cxj.day01.codes.DemonDay01;

import java.util.Arrays;

// 主要是区别面向过程和面向对象
// 输出格式为 [10, 20, 30, 40, 50]
public class PrintArrary {
    public static void main(String[] args) {
//        面向过程操作
        int[] arrary = new int[]{10, 20, 30, 40, 50};
        System.out.print("[");
        for (int i = 0; i < arrary.length; i++) {
            if(i == arrary.length - 1){
                System.out.println(arrary[i] + "]");
            }else{
                System.out.print(arrary[i]+ ", ");
            }
        }
//        面向对象操作
        System.out.println(Arrays.toString(arrary));
    }
}

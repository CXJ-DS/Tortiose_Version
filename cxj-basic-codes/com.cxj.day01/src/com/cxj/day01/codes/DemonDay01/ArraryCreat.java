package com.cxj.day01.codes.DemonDay01;

// 1.动态数据创建:
// 数据类型[] 数组名称 = new 数据类型[数组长度或者数组元素个数];
//2.静态数组创建:
// 数据类型[] 数组名称 = new 数据类型{数据元素1，数据元素2,……};
public class ArraryCreat {
    public static void main(String[] args) {
        int[] arrary1 = new int[3];
        int[] arrary = {34, 64, 76};
        for (int i = 0; i < 3; i++) {
            System.out.println(arrary[i]);
        }
    }
}

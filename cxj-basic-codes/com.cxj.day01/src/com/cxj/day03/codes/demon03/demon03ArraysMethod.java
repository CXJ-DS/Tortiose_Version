package com.cxj.day03.codes.demon03;

import java.util.Arrays;

/*
此类主要是对Arrays的介绍以及其方法的使用：
public static String toString(数组):将参数数组转换为字符数组，并按照一定格式输出{默认格式：[字符1，字符2，字符3，……]
public static void sort(数组):自动排序，默认升序排序
注意事项:
1.数组如果是数值，则默认升序排序
2.字符数组，则默认首字母顺序升序排序
3.自定义类型数组，则自定义类需要接口支持(Comparable)
 */
public class demon03ArraysMethod {
    public static void main(String[] args) {
        int[] intArray = { 20, 10, 40, 80, 50};
        String s = Arrays.toString(intArray);
        System.out.println("toString输出的数组: " + s);
        int[] array1 = {4,456,324,456,235,78};
        Arrays.sort(array1);
        String m = Arrays.toString(array1);
        System.out.println("排序后的toString数组: " + m);
    }
}

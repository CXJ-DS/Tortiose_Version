package com.cxj.day03.codes.demon03;

import java.util.Arrays;

/*
将一组字符串打印倒序输出
 */
public class demon03ArraysPractice {

    public static void main(String[] args) {
        String str = "lk2j4fdsa31hg5";
        //只有将字符串转换为数组，才能用Arrays进行排序
        //将字符串转换成数组：toCharArrays()
        char[] chars = str.toCharArray();
        //将转换后的数组升序排列
        Arrays.sort(chars);
        System.out.println(chars);
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i] + " ");
        }
        System.out.println();
    }
}

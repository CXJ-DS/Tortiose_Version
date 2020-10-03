package com.cxj.day03.codes.demon01;

/*
String截取方法
1.从一个索引位置截取，一直到数组末尾： public String substring(int index)
2.从指定索引位置，一直截取到指定末尾索引位置：public String substring(int begin, int end)
范围是[begin,end)
 */
public class demon03Substring {
    public static void main(String[] args) {
        String str1 = "Hello ";
        String str2 = "World!";
        String str3 = str1.concat(str2);
        System.out.println("拼接后的数组: " + str3);
        String substring1 = str3.substring(2);
        System.out.println("从指定索引位置截取后的数组: " + substring1);
        String substring2 = str3.substring(3, 7);
        System.out.println("指定范围截取的数组: " + substring2);
    }
}

package com.cxj.day03.codes.demon01;

/* 创建数组的长度获取 public int length ()
将两个不同数组拼接在一次  public String concat(String string)
查找数组某一字符第一次出现的索引位置 public int indexOf(String string)
查找指定索引位置的字符 public char CharAt(int index)
【重点】 一旦数组创建，就无法随意更改内容
*/
public class demon01StringGet {
    public static void main(String[] args) {
        char[] charArray = new char[]{'H','e','l','l','o','!'};
        String str1 = new String(charArray);
        System.out.println("创建的数组的长度为: ");
        System.out.print(str1.length());
        String str2 = " It's me.";
        System.out.println("第二个数组:" + str2);
        String str3 = str1.concat(str2);
        System.out.println("拼接之后的数组:" + str3);
        int num = str3.indexOf("l");
        System.out.println("你查找'l'的第一次索引位置: " + num);
        char charA = str1.charAt(3);
        System.out.println("你所要的索引位置: " + charA);
    }
}

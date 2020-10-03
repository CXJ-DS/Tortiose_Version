package com.cxj.day03.codes.demon01;
/*
String数组的分割以及替换
1.数组类型转换：public Char[] toCharArray()  将当前数组类型拆分为字符数组
public byte[] getBytes() 将数组拆分为字节数组
2.数组替代: public String replace(CharSequence oldString, CharSequence newString)
【注意事项】String的直接创建，并不能用遍历输出，可以直接输出
 */
public class demon04StringConvert {
    public static void main(String[] args) {
        //将String数组转换为Char数组
        String str = "Hello";
        System.out.println("定义的String数组: " + str);
        System.out.println("String数组的长度: " + str.length());
        char[] charA = str.toCharArray();
        System.out.println("转换后的字符数组:");
        for (int i = 0; i < charA.length; i++) {
            System.out.println(charA[i]);
        }
        System.out.println("字符数组的长度:" + charA.length);
        System.out.println("--------------------");

        //将String数组转换为字节数组
        String str2 = "ABCD";
        System.out.println("定义的String数组:" + str2);
        System.out.println("String数组的长度:" + str2.length());
        byte[] byteB = str2.getBytes();
        System.out.println("转换后的Byte数组:");
        for (int i = 0; i < byteB.length; i++) {
            System.out.println(byteB[i]);
        }
        System.out.println("Byte数组的长度:" + byteB.length);
    }
}

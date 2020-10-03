package com.cxj.day03.codes.demon01;

/*
题目描述：定义一个方法，将数组[word,word,word]按照指定格式拼接成一个字符串，例如输出格式为：[#word1#word2#word3]
 */
public class demon03StringPractice {
    public static void main(String[] args) {
        int[] array = {1,2,3};
        String array3 = getSubstring(array);
        System.out.println("转换后的字符串: " + array3);
    }
    public static String  getSubstring(int[] array ){
       String str1 = "[";
        for (int i = 0; i < array.length; i++) {
            if(i == array.length-1){
                str1 += "word" + array[i] + "]";
            }else{
                str1 += "word" + array[i] + "#";
            }
        }
        return str1;
    }
}

package com.cxj.day03.codes.demon01;
/*
public String[] split(String regex) 以一个字符为分割点，将数组分割成若干部分
【注意事项】在数组当中出现了'.'(英文句点)，在split中应在句点之前加两个反斜杠\\
例子:split("\\.");
 */
public class demon03Split {
    public static void main(String[] args) {
        String str1 = "赵丽颖,李訫,陈晓,关之琳,李丽珍,邱淑贞";
        String[] splitA = str1.split(",");
        for (int i = 0; i < splitA.length; i++) {
            System.out.println(splitA[i]);
        }
        System.out.println("---------------------");
        String str2 = "Kebo.McGrady.curry.Wade.James";
        String[] splitB = str2.split("\\.");
        for (int i = 0; i < splitB.length; i++) {
            System.out.println(splitB[i]);
        }
    }
}

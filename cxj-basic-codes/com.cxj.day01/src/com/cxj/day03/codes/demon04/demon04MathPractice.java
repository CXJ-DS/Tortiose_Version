package com.cxj.day03.codes.demon04;
/*
题目描述: 指定一个范围-10.8到5.9，在这个范围内绝对值大于6或者绝对值小于2.1的整数有多少
1.确定范围，用for循环进行遍历判断
2.找的是整数，范围可以进一步改进
  2.1 将-10.8向上取整（向右），得-10.0
  2.2 将-10.8强制转换为int整形，剩下的数字都为整数
3.绝对值大于6或者小于2.1 用Math.ads()
4.记录整数的个数 count++
 */
public class demon04MathPractice {

    public static void main(String[] args) {
        int count = 0;
        double min = -10.8;
        double max = 5.9;
        //将-10.8向上取整
        for(double i = Math.ceil(min); i < max; i++ ){
            double num = Math.abs(i);
            if(num >6 || num <2.1){
                System.out.println(i);
                count++;
            }
        }
        // 将-10.8强制转换成整形
//        for(int i = (int)min ; i < max; i++){
//            int num = Math.abs(i);
//            if(num > 6 || num < 2.1){
//                System.out.println(i);
//                count++;
//            }
//        }
        System.out.println("总共有" + count + "个整数");
    }

}

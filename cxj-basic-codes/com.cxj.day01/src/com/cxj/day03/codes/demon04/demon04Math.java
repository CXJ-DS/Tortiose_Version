package com.cxj.day03.codes.demon04;
/*
1.绝对值获取(转换)
public static double ads(double 数值)
2.向上取整
public static double ceil(double 数值)
3.向下取整
public static double floor(double 数值)
4.四舍五入
public static long round(double 数值)

【注意事项】
对于向下向下取整，当小数点之后是零，则不进行取整操作，例如ceil(21.0)-->21.0;floor(56.0)-->56.0
Math.PI 表示近似的圆周率常量（double）
 */
public class demon04Math {

    public static void main(String[] args) {
        //绝对值获取
        System.out.println(Math.abs(67));
        System.out.println(Math.abs(-34.5));

        //向上取整
        System.out.println(Math.ceil(21.5));
        System.out.println(Math.ceil(21.0));

        //向下取整
        System.out.println(Math.floor(45.8));
        System.out.println(Math.floor(45.1));

        //四舍五入
        System.out.println(Math.round(3.14));
        System.out.println(Math.round(3.5));
    }

}

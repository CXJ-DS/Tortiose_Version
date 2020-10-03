package com.cxj.day05.codes.demon04;
/*
如何调用内部类的方法
1.间接调用： 先调用外部类方法，再通过外部类调用内部类中的方法；main方法只是调用外部类方法
2.直接调用： 一般格式： 类名称 对象名 = new 类名称();
特殊格式: 【外部类名称.内部类名称 对象名 = new 外部类名称().new 内部类名称();】
注意：间接调用会将外部类方法一并输出，直接调用只输出内部类的方法
 */
public class InnerClass {

    public static void main(String[] args) {
        Body body = new Body("赵丽颖");
        body.Method();

        System.out.println("0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0");
        Body.Heart heart = new Body("古力娜扎").new Heart();
        heart.beat();

        System.out.println("0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0");
        body.MethodNum();
    }

}

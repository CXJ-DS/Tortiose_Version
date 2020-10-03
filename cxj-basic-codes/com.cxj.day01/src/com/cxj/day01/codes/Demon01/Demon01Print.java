package com.cxj.day01.codes.Demon01;

//  实例化对象操作   具体步骤为对象创建（或者导入对象包）、使用对象方法
// 创建对象的格式： 类名称 对象名 = new 类名称();
public class Demon01Print {
    public static void main(String[] args) {
//    对象实例化(创建)
    Student stu = new Student();
    System.out.println(stu.id);
    System.out.println(stu.name);
    System.out.println(stu.age);
    System.out.println(stu.grade);
    System.out.println("-------------");
    stu.name = "陈先俊";
    stu.age = 18;
    stu.grade = 2017203;
    stu.id = 201720321;
    System.out.println(stu.id);
    System.out.println(stu.name);
    System.out.println(stu.age);
    System.out.println(stu.grade);
    System.out.println("-------------");
//  对象行为使用
        stu.eat();
        stu.sleep();
        stu.study();
    }

}

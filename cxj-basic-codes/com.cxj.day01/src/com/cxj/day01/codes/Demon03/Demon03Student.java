package com.cxj.day01.codes.Demon03;

import java.util.Scanner;

public class Demon03Student {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("赵丽颖");
        stu.setAge(18);
        stu.setGrade(2017203);
        System.out.println("姓名:" + stu.getName() + " 年龄:" + stu.getAge() + " 班级" + stu.getGrade());
        Student stu1 = new Student("古力娜扎",21,2017201);
        System.out.println("姓名:" + stu1.getName() + " 年龄:" + stu1.getAge() + " 班级" + stu1.getGrade());

    }
}

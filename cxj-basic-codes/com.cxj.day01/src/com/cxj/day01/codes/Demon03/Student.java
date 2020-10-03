package com.cxj.day01.codes.Demon03;
// 标准的Java bean
//  1. 成员变量（private修饰）
//  2. getter/setter方法
//  3.无参构造方法
//  4.全参构造方法
public class Student {
    private  String name;
    private  int age;
    private int grade;

    public Student() {
    }

    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}

package com.cxj.day03.codes.demon02;

public class demon02StaticStudent {
    public static void main(String[] args) {
        Student.setRoom(201720321);
        System.out.println("班级为:" + Student.getRoom());
        Student one = new Student("赵丽颖",21);
        Student two = new Student("陈晓",20);
        System.out.println("one的姓名: " + one.getName() + " one的年龄: " + one.getAge() + " one的班级为: " + Student.getRoom());
        System.out.println("two的姓名: " + two.getName() + " two的年龄: " + two.getAge() + " one的班级为: " + Student.getRoom());
    }
}

package com.cxj.day02.codes.demon03;

import java.util.ArrayList;

public class demon03ArrayListStudent {
    public static void main(String[] args) {
        //创建集合
        ArrayList<Student> one = new ArrayList<>();
        //创建三个对象，并添加信息
        Student two = new Student("赵丽颖",18);
        Student three = new Student("刘诗诗",21);
        Student four = new Student("唐嫣",20);
        //向集合中添加对象
        one.add(two);
        one.add(three);
        one.add(four);
        //遍历输出
        for (int i= 0; i < one.size(); i++) {
            Student stu = one.get(i);
            System.out.println("姓名：" + stu.getName() + "  年龄:" + stu.getAge());
        }
    }
}

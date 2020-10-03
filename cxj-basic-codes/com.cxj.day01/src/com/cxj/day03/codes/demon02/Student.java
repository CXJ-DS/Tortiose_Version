package com.cxj.day03.codes.demon02;

public class Student {
    private String name;
    private int age;
    private static int room;
    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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

    public static int getRoom() {
        return room;
    }

    public static void setRoom(int room) {
        Student.room = room;
    }
}

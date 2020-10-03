package com.cxj.day02.codes.demon03;

public class demon03Array {
    public static void main(String[] args) {
        Person[] per =new Person[3];
        Person one = new Person("赵丽颖",18);
        Person two = new Person("迪丽热巴",19);
        Person three = new Person("古力娜扎",21);
//        存放的地址值
        per[0] = one;
        per[1] = two;
        per[2] = three;
//        调用数组中的地址值
        System.out.println(per[0]);
        System.out.println(per[1]);
        System.out.println(per[2]);
        for (int i = 0; i < 3; i++) {
            System.out.println("姓名:" + per[i].getName() + "  年龄:" + per[i].getAge());
        }
    }
}

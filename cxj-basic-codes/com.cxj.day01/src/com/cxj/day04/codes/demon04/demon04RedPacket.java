package com.cxj.day04.codes.demon04;


import java.util.ArrayList;

public class demon04RedPacket {
    public static void main(String[] args) {
        Manager manager = new Manager("赵丽颖" , 100);
        System.out.println("群主: " + manager.getName() + " 余额: " +manager.getMoney());
        Member one = new Member("陈晓" , 12);
        Member two = new Member("古力娜扎" , 15);
        Member three = new Member("杨幂" , 12);

        manager.PrintUser();
        one.PrintUser();
        two.PrintUser();
        three.PrintUser();
        System.out.println("-----------------------------");

        ArrayList<Integer> list = manager.sendMoney(29, 3);
        one.recieve(list);
        two.recieve(list);
        three.recieve(list);
        
        manager.PrintUser();
        one.PrintUser();
        two.PrintUser();
        three.PrintUser();
    }
}

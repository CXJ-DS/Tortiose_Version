package com.cxj.day04.codes.demon04;

import java.util.ArrayList;

//发红包的群主
public class Manager extends User {

    public Manager() {
        // super();
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> sendMoney(int totalMenoy, int count){
        ArrayList<Integer> redList = new ArrayList<>();
        //获得金额，先与余额比较，是否可以发红包
        int mon = super.getMoney();
        if(totalMenoy > mon){
            System.out.println("余额不足!");
            return redList;
        }else{
            super.setMoney(mon - totalMenoy);
            int avg = totalMenoy / count;
            int over = totalMenoy % count;
            for (int i = 0; i < count - 1; i++) {
                redList.add(avg);
            }
            int overMoney = avg + over;
            redList.add(overMoney);
        }
        return redList;
    }
}

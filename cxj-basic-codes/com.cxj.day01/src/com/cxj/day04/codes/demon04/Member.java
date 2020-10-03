package com.cxj.day04.codes.demon04;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {

    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void recieve(ArrayList<Integer> list){
        //在集合中随机选取一个红包
        int index = new Random().nextInt(list.size());
        //选了红包之后，集合中去除该金额
        int delt = list.remove(index);
        //获得群员金额
        int MemMenoy = super.getMoney();
        //将红包存入群余额中
        super.setMoney(delt + MemMenoy);
    }
}

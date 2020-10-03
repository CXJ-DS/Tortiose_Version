package com.cxj.day02.codes.demon03;

import java.util.ArrayList;
import java.util.Random;

public class demon03ArrayListRandom {
    public static void main(String[] args) {
        Random one = new Random();
        ArrayList<Integer> integer = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            int num = one.nextInt(32) + 1;
            integer.add(num);
            System.out.println(integer.get(i));
        }
    }
}

package com.cxj.day06.codes.demon03;

import java.util.Arrays;
import java.util.Calendar;

/*
24 x 60 x 60 x 1000 = 86400000 x 365 = 31536000000
 */
public class CalendarMain {

    public static void main(String[] args) {
//        demon01();
        System.out.println((System.currentTimeMillis()/31536000000l));
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {6, 7, 8, 9, 10};
        System.out.println("复制前: "+ Arrays.toString(two));
        System.arraycopy(one,0,two,0,3);
        System.out.println("复制后: "+ Arrays.toString(two));
    }

    private static void demon01() {
        //使用getInstance获取Calendar对象
        Calendar one = Calendar.getInstance();
        //更改年月日到相应格式
        one.set(Calendar.YEAR,1999);
        one.set(Calendar.MONTH, 3);
        one.set(Calendar.DAY_OF_MONTH, 21);
        //将指定年月日增加或者减少
        one.add(Calendar.YEAR, 1);//增加一年
        one.add(Calendar.YEAR, -1);//减少一年
        int year = one.get(Calendar.YEAR);
        System.out.println("年:" + year);
        int Month = one.get(Calendar.MONTH);
        System.out.println("月:" + Month);
        int day = one.get(Calendar.DAY_OF_MONTH);
        System.out.println("日:" + day);
        int hour = one.get(Calendar.HOUR);
        System.out.println("小时:" + hour);
        int minute = one.get(Calendar.MINUTE);
        System.out.println("分:" + minute);
        int second = one.get(Calendar.SECOND);
        System.out.println("秒:" + second);
    }

}

package com.cxj.day04.codes.demon02;

public class NewPhone extends OldPhone{
    //新手机功能：发短息、打电话、显示号码、显示来电人头像、显示来电人姓名
    @Override
    public void show() {
        super.show();
        System.out.println("显示来电号码！");
        System.out.println("显示来电头像！");
        System.out.println("显示来电姓名！");
    }
}

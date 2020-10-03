package com.cxj.day05.codes.demon03;

public class Keyboard implements USB {
    @Override
    public void Open() {
        System.out.println("打开键盘了！");
    }

    @Override
    public void Close() {
        System.out.println("关闭键盘了！");
    }
    public void type(){
        System.out.println("键盘输入!");
    }
}

package com.cxj.day05.codes.demon03;

public class Mouse implements USB {
    @Override
    public void Open() {
        System.out.println("打开鼠标!");
    }

    @Override
    public void Close() {
        System.out.println("关闭鼠标了");
    }
    public void Click(){
        System.out.println("点击屏幕");
    }
}

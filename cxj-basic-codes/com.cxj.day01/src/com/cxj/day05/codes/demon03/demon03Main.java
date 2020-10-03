package com.cxj.day05.codes.demon03;


public class demon03Main {

    public static void main(String[] args) {
        //创建电脑对象，方便调用电脑的功能方法
        Computer computer = new Computer();
        computer.powerOn();
        System.out.println("---------------");

        //向上转型，便于方便调用鼠标和键盘
        USB mouse = new Mouse();
        computer.useDevice(mouse);
        System.out.println("---------------");

        USB keyboard = new Keyboard();
        computer.useDevice(keyboard);
        System.out.println("---------------");

        computer.powerOff();
    }

}

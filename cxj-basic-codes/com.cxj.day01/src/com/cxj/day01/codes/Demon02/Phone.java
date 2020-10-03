package com.cxj.day01.codes.Demon02;

public class Phone {
//    成员变量创建
    String name;
    Double price;
    String color;
    String CPU;
//    成员行为创建
    public void Call(String who){
        System.out.println("给" + who +"打电话");
    }
    public  void sendMessage(){
        System.out.println("发短信");
    }
    public void Game(){
        System.out.println("打游戏");
    }
}

package com.cxj.day06.codes.demon04;

public class WaitandNotify {

    public static void main(String[] args) {
        //创建锁对象
        Object obj = new Object();

        //匿名内部类创建顾客
        new Thread(){
            //重写覆盖run方法
            @Override
            public void run() {
                //使用锁对象进行线程保护
                synchronized (obj){
                    System.out.println("告知老板需要多少包子及数量");
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("包子已做好，开吃！");
                }
            }
        }.start();

        //利用匿名内部类创建老板
        new Thread(){
            //重写覆盖run方法
            @Override
            public void run() {
                synchronized (obj){
                    System.out.println("老板正在做包子，需要等待五秒");
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    obj.notify();
                }
            }
        }.start();
    }

}

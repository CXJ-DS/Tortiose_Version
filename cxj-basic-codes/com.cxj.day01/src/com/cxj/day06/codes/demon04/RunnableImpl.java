package com.cxj.day06.codes.demon04;
/*
    处理多线程共享重复问题
     synchronize(锁对象){
        出现代码共享重复的代码
     }
 */
public class RunnableImpl implements Runnable {

    private int ticket = 100;

    Object object = new Object();

    @Override
    public void run() {
        while(true){
            synchronized (object){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //判断是否卖完票
                if( ticket > 0){
                    System.out.println(Thread.currentThread().getName() + "---> 正在卖第" + ticket + "票" );
                    ticket--;
                }
            }
        }
    }
}

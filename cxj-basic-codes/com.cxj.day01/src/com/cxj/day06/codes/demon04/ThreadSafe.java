package com.cxj.day06.codes.demon04;

public class ThreadSafe {

    public static void main(String[] args) {

        RunnableImpl impl = new RunnableImpl();

        Thread one = new Thread(impl);
        Thread two = new Thread(impl);
        Thread three = new Thread(impl);

        one.start();
        two.start();
        three.start();
    }

}

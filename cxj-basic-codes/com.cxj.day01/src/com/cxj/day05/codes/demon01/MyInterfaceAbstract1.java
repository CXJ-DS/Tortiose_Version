package com.cxj.day05.codes.demon01;

public interface MyInterfaceAbstract1 {

    public final static int CLASS_NUM = 34;

    public abstract void MyInterfaceAbstract1();

    public default void Method(){
        System.out.println("BBB");
    }
    public static void StaticMethod1(){
        System.out.println("接口MyInterfaceAbstract1中的静态方法实行了!");
    }
}

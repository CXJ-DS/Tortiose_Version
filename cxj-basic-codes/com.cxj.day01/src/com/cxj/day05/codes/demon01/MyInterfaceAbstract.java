package com.cxj.day05.codes.demon01;

public interface MyInterfaceAbstract {

    public static final int CLASS_NUM = 10;

    public abstract void MyInterface();

    public default void Method(){
        System.out.println("AAA");
    }

    public static void StaticMethod(){
        System.out.println("接口MyInterfaceAbstract中的静态方法实行了!");
    }
}

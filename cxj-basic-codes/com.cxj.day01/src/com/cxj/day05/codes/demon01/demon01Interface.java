package com.cxj.day05.codes.demon01;
/*
1.不能直接用接口，得用接口的”实现类“进行使用
格式：public interface 接口名称 implements 接口{
      ……
}
2.接口的实现类必须重写所有抽象方法，否则报错
3.接口不能直接创建对象，得用接口的实现类创建对象
 */
public class demon01Interface {

    public static void main(String[] args) {
        MyInterfaceAbstractImpl impl = new MyInterfaceAbstractImpl();
        impl.MyInterface();
    }
}

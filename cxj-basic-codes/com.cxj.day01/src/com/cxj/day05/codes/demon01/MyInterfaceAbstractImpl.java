package com.cxj.day05.codes.demon01;

public class MyInterfaceAbstractImpl implements MyInterfaceAbstract,MyInterfaceAbstract1 {
    @Override
    public void MyInterface() {
        System.out.println("执行了!");
    }

    @Override
    public void MyInterfaceAbstract1() {
        System.out.println("执行了");
    }

    //接口中的冲突默认方法需手写覆盖重写，并且重复的默认方法在实现类中只需重写一遍即可
    @Override
    public void Method() {
        System.out.println("AAA");
        System.out.println(MyInterfaceAbstract.CLASS_NUM );
        System.out.println(MyInterfaceAbstract1.CLASS_NUM );
    }
}

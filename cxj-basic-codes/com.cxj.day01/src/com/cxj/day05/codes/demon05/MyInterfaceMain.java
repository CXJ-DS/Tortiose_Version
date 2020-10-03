package com.cxj.day05.codes.demon05;

/*
1.对于实现类中，如果只有一个抽象方法，那么实现类的使用次数只有一次，资源占用过多
2.匿名内部类的定义格式：
接口名称 对象名 = new 接口名称(){
   重写覆盖接口中的抽象方法
};【最后的分号不能省略，否则出现编译报错】
好处：可以直接实现接口中的抽象方法，不用再通过实现类转抽象方法实现
 */
public class MyInterfaceMain {
    public static void main(String[] args) {
        //一般写法  用实现类完成接口中的抽象方法实现
        MyInterfaceImpl impl = new MyInterfaceImpl();
        impl.method();
        System.out.println("0-0-0-0-0-0-0-0-0-0-0-0");

        //使用匿名内部类完成对接口中的抽象方法的实现
        MyInterface Unknown = new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类接口执行了");
            }
        };
        Unknown.method();
    }
}

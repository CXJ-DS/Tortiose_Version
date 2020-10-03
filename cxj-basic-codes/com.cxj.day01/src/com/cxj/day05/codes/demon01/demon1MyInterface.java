package com.cxj.day05.codes.demon01;
/*
1.一个父类可以有多个子类，但一个子类只能有一个父类(单继承);一个接口只有一个实现类，但一个实现类能有多个接口(多继承)
2.接口中抽象方法格式：public abstract void 方法名称(参数列表); 实现类中必须重写覆盖接口中的所有的抽象方法
3.接口中默认方法: public default void 方法名称(参数列表); 实现了中必须重写覆盖接口中的默认方法，
  如果有冲突则只重写覆盖一个默认方法即可
4.接口中允许定义私有方法,格式:
  4.1 普通私有方法 private 返回值类型 方法名称(){.....}
  4.2 静态私有接口 private static 返回值类型 方法名称(){......}
私有类接口只能接口自己使用
5.静态方法  public static 返回值类型 方法名称(){......}
只能通过接口进行调用，创建的实现类的对象不能进行调用;在实现类中可以不用重写覆盖静态方法
6.接口中的成员变量(也就是常量) 格式： public static final 数据类型  常量名称 = 数据值;
成员变量一经创建，在运行时则不能随意更改。
常量名称必须大写，中间用下划线连接，例如: CLASS_INT_NUM
调用时，用实现类中的方法进行调用
 */
public class demon1MyInterface {
    public static void main(String[] args) {
        MyInterfaceAbstractImpl impl = new MyInterfaceAbstractImpl();
        impl.Method();
        impl.MyInterface();
        impl.MyInterfaceAbstract1();
        System.out.println("----------------");

        MyInterfaceAbstract.StaticMethod();
    }
}

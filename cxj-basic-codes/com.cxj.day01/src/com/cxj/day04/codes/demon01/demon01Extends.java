package com.cxj.day04.codes.demon01;
/*
子类可以调用子类以及父类的东西，而父类只能调用自己的东西，并不能向下查找
1.直接调用
对象名对应的调用东西有哪些，就调用那些，没有就向上查找
2.间接调用
用对象名调用子父类的方法或者成员，子类可以间接调用子类没有而父类有的类，父类则不能向下调用

3.子类中方法中调用成员各个变量
  3.1  调用局部变量   直接调用
  3.2  调用本类中的成员变量   this.本成员变量
  3.3  调用父类成员变量   super.父类成员变量
4.当父子类当中出现相同名称的方法以及相同参数，则使用@Override进行重写（覆盖重写）
  4.1 Override： 方法名相同，参数个数相同
  4.2 Overload： 方法名相同，参数个数不同
 */
public class demon01Extends {

    public static void main(String[] args) {
        //直接调用父类
        Fu fu = new Fu();
        System.out.println(fu.name + fu.age);
        //间接调用
        Zi zi = new Zi();
        zi.FuMethod();
        System.out.println(zi.name+zi.age);

        zi.ZiMethod();
    }

}

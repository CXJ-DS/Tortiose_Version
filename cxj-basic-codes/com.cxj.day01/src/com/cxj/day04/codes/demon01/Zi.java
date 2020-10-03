package com.cxj.day04.codes.demon01;

/*
重写的注意事项：
1.在出现相同的方法名和参数个数一样的情况下，重写可以避免调用错误(重写可以检测是否正确覆盖)
2.重写的方法返回值大小范围必须小于父类方法返回值范围
3.子类的权限修饰符必须大于父类权限修饰符的范围
权限修饰符大小排行： public > protected > (default) > private
 */
public class Zi extends Fu{
    String name = "冯绍峰";
    int age = 23;
    public void ZiMethod(){
        String name = "陈晓";
        System.out.println("……");
        System.out.println(name);//调用局部变量
        System.out.println(this.name);//用于调用本类中的成员变量
        System.out.println(super.name);//用于调用父类成员变量
    }

    @Override
    public String method(){
        return null;
    }
}

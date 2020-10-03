package com.cxj.day04.codes.demon03;

/*
子类父类的构造方法继承
1.在父类中创建无参构造方法，子类构造方法需要用“super.()”调用父类构造方法；
2.super.()如果未写明，系统免费赠送一个；在父类构造方法中有参构造，则在子类中必须写明"super.(参数);"进行调用
3.super.()在构造方法中有且只能使用一次，并且第一语句必须是super.()
 */
public class demon03Constructor {

    public static void main(String[] args) {
        Zi zi = new Zi();
    }

}

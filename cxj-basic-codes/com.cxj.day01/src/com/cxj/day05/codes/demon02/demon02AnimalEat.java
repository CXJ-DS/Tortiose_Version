package com.cxj.day05.codes.demon02;

/*
1.多态性：是指一个事物有多个形态，比如 动物中有猫，猫也是动物
2.向下转型时，必须还原成原来的形态，也就是猫作为动物状态，还原后状态必须为猫，不能还原成其他形态(狗)。、
3.instanceof进行判断，类型为布尔值，保证了向下转型的成功
 */

public class demon02AnimalEat {

    public static void main(String[] args) {
        //向上转型（小范围转换为大范围）
        //格式： 父类名称 对象名 = new 子类名称();
        Animal one = new Dog();
        one.eat();
        System.out.println("------------------------");

        //向下转型（大范围转换为小范围）
        //格式： 子类名称 对象名 = （子类名称） 父类创建的对象名;

        if (one instanceof Cat){
            Cat cat = (Cat) one;
            cat.MaiMeng();
        }
        if (one instanceof Dog){
            Dog dog = (Dog) one;
            dog.WatchHome();
        }
    }

}

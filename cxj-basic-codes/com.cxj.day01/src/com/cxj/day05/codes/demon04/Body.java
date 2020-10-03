package com.cxj.day05.codes.demon04;

/*
局部内部类创建格式：
权限修饰符 class 外部类名称{
   权限修饰符 返回值类型 外部类名称(){
      class 内部类名称{
          局部变量
          内部类方法
      }
      创建内部类对象 调用内部类的方法
   }
}
 */
public class Body {//外部类
    private String name;

    public class Heart{// 内部类
        //内部类方法
        public void beat(){
            System.out.println("心脏砰砰跳!");
            System.out.println("我的名字: " + name);
        }
    }

    //外部类方法
    public void Method(){
        System.out.println("Body方法执行了!");
//        Heart heart = new Heart();
//        heart.beat();
        // 匿名对象调用beat内部类对象
        new Heart().beat();
    }

    //局部变量内部类
    public void MethodNum(){
        System.out.println("成员方法局部变量执行了!");
        class Num{
            int numA = 520;
            public void NumOuter(){
                System.out.println("内部类局部变量: " + numA);
            }
        }
        Num num = new Num();
        num.NumOuter();
    }

    public Body(String name) {
        this.name = name;
    }

    public Body() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
package com.cxj.day06.codes.demon01;

/*
使用类作为成员变量，格式和创建成员变量一样
只是需要单独创建一个类对象进行信息录入，再讲信息载入到上一级类中
 */
public class HeroMain {

    public static void main(String[] args) {
        //创建英雄角色
        Hero hero = new Hero();
        hero.setName("小卤蛋");
        hero.setAge(12);
        //创建英雄技能
        Skill skill = new Skill("鱼雷",1100);
        //将英雄技能放入hero中
        hero.setSkill(skill);
        //输出英雄信息及技能
        hero.attack();
    }
}

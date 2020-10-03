package com.cxj.day06.codes.demon02;

public class HeroMain {
    public static void main(String[] args) {
        //创建英雄信息
        Hero hero = new Hero();
        hero.setName("妲己");
        hero.setAge(23);
//        //创建接口对象，完成接口信息录用【重点】
//        //第一种方式： 直接创建
//        hero.setSkill(new SkillImpl());
//        hero.HeroAttack();
//        //第二种方式: 匿名内部类
//        Skill skill = new Skill() {
//            @Override
//            public void attack() {
//                System.out.println("piu~piu~piu~");
//            }
//        };
//        hero.setSkill(skill);
//        hero.HeroAttack();
        //第三种:匿名内部类 + 匿名对象
        hero.setSkill(new Skill() {
            @Override
            public void attack() {
                System.out.println("bu~bu~bu~");
            }
        });
        hero.HeroAttack();
    }
}

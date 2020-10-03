package com.cxj.day06.codes.demon01;

public class Hero {

    private String name;
    private int age;
    Skill skill;

    public Hero() {
    }

    public Hero(String name, int age, Skill skill) {
        this.name = name;
        this.age = age;
        this.skill = skill;
    }

    public void attack(){
        System.out.println("英雄： " + name + ",年龄: "+ age +", 攻击技能: " + skill.getName() + ",伤害:" + skill.getHurt() );
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }
}

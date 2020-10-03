package com.cxj.day06.codes.demon02;

public class Hero {

    private String name;
    private Skill skill;
    private int age;

    public Hero() {
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public Hero(String name, int age,Skill skill) {
        this.name = name;
        this.age = age;
        this.skill = skill;
    }

    public void HeroAttack(){
        System.out.println("姓名: " + name + " 年龄: " + age);
        skill.attack();
        System.out.println("技能冷却中");
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
}

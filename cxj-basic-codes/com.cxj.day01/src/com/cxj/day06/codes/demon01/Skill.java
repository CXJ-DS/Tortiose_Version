package com.cxj.day06.codes.demon01;

public class Skill {

    private String name;
    private int hurt;

    public Skill() {
    }

    public Skill(String name, int hurt) {
        this.name = name;
        this.hurt = hurt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHurt() {
        return hurt;
    }

    public void setHurt(int hurt) {
        this.hurt = hurt;
    }
}

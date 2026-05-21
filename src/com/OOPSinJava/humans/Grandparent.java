package com.OOPSinJava.humans;

public class Grandparent {
    private String name;

    private int age;

    private boolean hasSuperPower;

    public boolean hasHasSuperPower() {
        return hasSuperPower;
    }


    public Grandparent(String name, int age){
        this.name = name;
        this.age = age;
        hasSuperPower = false;
        System.out.println("Grandparent constructor called");
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

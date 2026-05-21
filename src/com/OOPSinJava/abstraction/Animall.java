package com.OOPSinJava.abstraction;

public abstract class Animall {
    private String name;

    private int age;

    public void sleep(){
        System.out.println("zzz");
    }

     protected abstract void sayHello();

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

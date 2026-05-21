package com.OOPSinJava.abstraction;

public class Dog extends Animall {

    private String name;

    private int age;

    public void sleep(){
        System.out.println("zzz");
    }

    @Override
    public void sayHello() {
        System.out.println("Woof");
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

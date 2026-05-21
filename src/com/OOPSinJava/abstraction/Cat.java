package com.OOPSinJava.abstraction;

public class Cat extends Animall {

    private String name;

    private int age;

    @Override
    public void sayHello() {
        System.out.println("Meow");
    }

    public void sleep(){
        System.out.println("zzz");
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

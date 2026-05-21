package com.OOPSinJava.accessmodifiers.school;

public class Student {

    public String name;

    public int age;

    private Student(){};

    public static void sayHello(){
        System.out.println("Hey");
    }

    public static void sayBye(){
        System.out.println("Bye");
    }
}
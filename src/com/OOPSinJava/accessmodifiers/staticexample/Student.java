package com.OOPSinJava.accessmodifiers.staticexample;

public class Student {
    public static int count = 0;

    private int id;
    private String name;
    private int rNumber;
    //static is used for initializing the one time  block of code
    static {
        System.out.println("Hello this is the static content");
    }

    public Student(){
        count++;
    }
}

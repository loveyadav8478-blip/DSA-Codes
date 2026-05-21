package com.OOPSinJava.test;

import com.OOPSinJava.humans.Child;

public class Test {
    public static void main(String[] args) {
        Child child = new Child("Henry",20);
        System.out.println(child.getAge());
        child.childMethod();
        System.out.println(child.getName());
    }
}

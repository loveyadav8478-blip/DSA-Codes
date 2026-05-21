package com.OOPSinJava.test;

public class Student {
    private String name;

    private int age;

    private int rollNumber;

    public Student (String name, int rollNumber, int age){
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if(age<0){
            System.out.println("Invalid Age");
            age = 0;
        }
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        if(rollNumber<0){
            System.out.println("Invalid Roll Number");
            rollNumber = 0;
        }
        return this.rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
}

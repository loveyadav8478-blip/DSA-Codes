package com.OOPSinJava.coreJava;
public class Student{
    String name;
    int rono;
    double percent;
    final String schoolName = "KCHS";
    static int numberOfStudent;
    public int getRono(){
        return rono;
    }
    public void setRono(int roll){
        roll = rono;
        return;
    }
//    public Student(){
//
//    }
    public static int getNumberOfStudent(){
        return numberOfStudent;
    }
    public Student(String name, int rono, double percent){
        this.name = name;
        this.rono = rono;
        this.percent = percent;
        numberOfStudent++;
    }
}
package com.OOPSinJava.utils;

public class School {

    private static School school = new School();

    private School(){

    }

    public static School getInstance(){
        return school;
    }
}

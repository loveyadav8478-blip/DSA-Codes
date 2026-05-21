package com.OOPSinJava.utils;

public class Utils {

    public final double PI = 3.14159;
    public static int max(int a, int b){
        if(a > b) return a;
        return b;
    }

    public static int min(int a, int b){
        if(a > b) return b;
        return a;
    }

    public static String trinAndUppercase(String s){
        if(s != null){
            return s.trim().toUpperCase();
        }
        return s;
    }
}

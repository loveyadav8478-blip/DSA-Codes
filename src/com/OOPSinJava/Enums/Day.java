package com.OOPSinJava.Enums;

public enum Day {
    MONDAY("Monday","somwar"),
    TUESDAY("Tuesday","mangal"),
    WEDNESDAY("Wednesday","buddh"),
    THURSDAY("Thursday","brispat"),
    FRIDAY("Friday","sukr"),
    SATURDAY("Saturday","sani"),
    SUNDAY("Sunday","ravi");

    private String lower;
    private String hindi;

    public String getLower() {
        return lower;
    }

    public String getHindi() {
        return hindi;
    }

    private Day(String lower, String hindi){
        System.out.println("Constructor is called");
        this.lower = lower;
        this.hindi = hindi;
    }

    public void display(){
        System.out.println("Today is "+ this.name());
    }
}

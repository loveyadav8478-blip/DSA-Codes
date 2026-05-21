package com.OOPSinJava.coreJava;

public class StudentClass {
//    public static class Student{
//        public String name;
//        int rono;
//        double percent;
//    }
    public static void main(String[] args) {
//        Student A = new Student();
//        A.name = "Love Yadav";
//        A.setRono(79);
//        A.percent = 92.8;
//        System.out.println(A.name);
//        System.out.println(A.percent);
//        System.out.println(A.getRono(76));
//        System.out.println(A.setRono(76));

//        Car c = new Car();
//        c.name = "Safari";
//        c.type = "SUV";
//        c.price = 2000000;
//        System.out.println(c.name);
//        System.out.println(c.type);
//        System.out.println(c.price);

//        Student s1 = new Student("Love",7,90);
//        String name = s1.name;
//        int roll = s1.getRono();
//        double per = s1.percent;
//        s1.name = "rkjv";
//        s1.rono = 44;
//        s1.percent = 44;
//        System.out.println(s1.name);
//        System.out.println(s1.getRono());
//        System.out.println(s1.percent);


//        System.out.println(s2.name);
//        System.out.println(s2.getRono());
//        System.out.println(s2.percent);
//        s2.schoolName ="dd";
//        System.out.println(s2.schoolName);
        System.out.println(Student.getNumberOfStudent());
        Student s1 = new Student("Love",7,90);
        Student s2 = new Student("Jay",6,80);
        Student s3 = new Student("Jas",65,80.5);
        System.out.println(s1.numberOfStudent);
        System.out.println(s2.numberOfStudent);
        System.out.println(s3.numberOfStudent);
    }
}

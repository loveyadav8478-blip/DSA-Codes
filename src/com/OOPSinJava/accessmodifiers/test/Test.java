package com.OOPSinJava.accessmodifiers.test;

import com.OOPSinJava.accessmodifiers.school.Student;
import com.OOPSinJava.accessmodifiers.zoo.Dog;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("Bob");
        dog.makeSound();
        dog.setDogSound("Woof");
        dog.makeSound();
        dog.wagTail();














//        Student student = new Student();This is not Possible because the private constructor is maded
//        Student.sayBye();

//        System.out.println(School.getInstance());
    }
}

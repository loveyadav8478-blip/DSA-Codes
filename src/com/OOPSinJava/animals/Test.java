package com.OOPSinJava.animals;

public class Test {
    public static void main(String[] args) {
        Annimal myAnimal = new Annimal();
        myAnimal.sayHello();

        Annimal dog = new Dog();//Up Casting
        dog.sayHello();

        Dog d = (Dog)dog;//Down Casting
//
//
//        Cat cat = new Cat();
//        cat.sayHello();
    }
}

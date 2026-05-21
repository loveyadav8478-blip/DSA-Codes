package com.OOPSinJava.accessmodifiers.zoo;


public class Dog extends Animalll {

    public Dog(String name){
        super(name, "Bark");
    }

    public void wagTail(){
        System.out.println(getName() + " Wag its tail");
    }

    private String getName(){
        return getClass().getSimpleName();
    }

    public void setDogSound(String newSound){
        changeSound(newSound);
    }

}

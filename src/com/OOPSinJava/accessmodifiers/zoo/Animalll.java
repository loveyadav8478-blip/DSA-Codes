package com.OOPSinJava.accessmodifiers.zoo;

public class Animalll {
    private String name;
    protected String sound;

    public Animalll(String name, String sound){
        this.sound = sound;
        this.name = name;
    }

    public void makeSound(){
        System.out.println(name + "make as sound : " + sound);
    }

    protected void changeSound(String newSound){
        this.sound = newSound;
    }

}

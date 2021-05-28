package com.quiz1;

public class Hero {
    String name;
    Pet pet = new Cat();

    public Hero (String name){

    }

    public Hero() {
    }

    public Hero(String name , Pet pet){

    }

    public void run(){
        System.out.println("hero run");
        pet.follow();
    }

}

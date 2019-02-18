package com.codingblocks.Lecture_11;

import java.util.ArrayList;

public class Human {
    private String name;

    private ArrayList<Pet> pets;

    public Human (String name){
        this.name = name;
        this.pets = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public void addPet(String name, String breed, int age){
        Pet pet = new Pet(name, breed, age);
        pets.add(pet);
//        pets.add(pet);
//
//        pets.add(pet);

    }

    public ArrayList<Pet> getPets() {
        return pets;
    }

    public  void eat(){
        this.openMouth();
        System.out.println("I am Eating");
    }

    public void laugh() {
        this.openMouth();
        System.out.println("I am laughing");
    }
    private void openMouth(){
        System.out.println("My mouth is Open");
    }
}

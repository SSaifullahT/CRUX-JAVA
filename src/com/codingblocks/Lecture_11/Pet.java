package com.codingblocks.Lecture_11;

import java.util.ArrayList;

public class Pet {
    private String name;
    private String breed;
    private int age;

    public Pet(String name, String breed,int age) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public int getPetAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public String toString(){
        return this.name + "," + this.breed + "," + this.age;

    }
}

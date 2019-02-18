package com.codingblocks.Lecture_19;

public class Human implements Comparable<Human>{
    private String name;
    private int age;
    private int salary;

    public Human(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public int compareTo(Human o) {
        return this.salary - o.salary;
    }

    @Override
    public String toString() {
        return this.name;
    }
}

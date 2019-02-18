package com.codingblocks.Lecture_12;

public class Main {
    public static void main(String[] args) {
//        add(1,3,5,56);
        Car c = new Audi();
        ((Audi) c).fly();
        System.out.println(((Audi) c).windows);
        //Car c = new Maruti();
        //Maruti m = (Maruti) c;
        Audi a  = new Audi();
        a.start();
        System.out.println(a.windows);

    }
    public static int add(int...nums){

        return 0;
    }
}

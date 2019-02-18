package com.codingblocks.Lecture_10;

import java.net.HttpURLConnection;

public class Client {
    public static void main(String[] args) {
        Human anuj = new Human();
        System.out.println(anuj.id);

//        System.out.println(anuj.population);/// It's not advised to access by object
//        System.out.println(Human.population);// this is better to access by classname because it shows that population is static
//        anuj.name = "Anuj Garg";
//        System.out.println(anuj.balance);
//
//        anuj.eat();

       // System.out.println(anuj.balance);

        Human rishabh = new Human();
        System.out.println(rishabh.id);

        Human syed = new Human();
        System.out.println(syed.id);
        //System.out.println(rishabh.balance);
//        anuj.height = 88;
//        System.out.println(anuj.name);
//        System.out.println(anuj.height);
//        anuj.smile();
        for (int i = 0; i <1000000 ; i++) {
            Human t = new Human();
        }
    }
}

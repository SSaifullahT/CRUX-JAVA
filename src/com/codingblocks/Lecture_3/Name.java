package com.codingblocks.Lecture_3;

import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        something("Saifullah");
    }
    public static void something(String name){
        System.out.println("DO Something " + name);
    }
    public static void swap(int a,int b){
        int t =a;
        a=b;
        b=t;

    }
}

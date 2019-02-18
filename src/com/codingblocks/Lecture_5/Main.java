package com.codingblocks.Lecture_5;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] nums ={21, 54, 77, 47, 56, 87, 25};
        int x = 7;
        int y = 8;
        swap(x,y);
        System.out.println(x);
        System.out.println(y);
    }
    public static void swap(Integer x, Integer y )
    {
        int temp = x;
        x = y;
        y = temp;
    }
}

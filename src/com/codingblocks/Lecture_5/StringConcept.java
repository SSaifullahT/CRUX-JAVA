package com.codingblocks.Lecture_5;

import java.util.ArrayList;

public class StringConcept {
    public static void main(String[] args) {
        String first = "hollolloll";
        String second = "hello";
        String third = "ho ho ho";
       // System.out.println(first + second + third);

        //System.out.println(first == second);

//        System.out.println(first.equals(second));
//        for (int i = 0; i < first.length(); i++) {
//            System.out.println(first.charAt(i));
//        }
        //substring(first);
        //System.out.println(first.indexOf("o",0));
        System.out.println( find_all_occ(third,"ho"));
    }
    public static void substring(String line)
    {
        //System.out.println(line.substring(1,3));
        for (int i = 0; i < line.length(); i++) {
            for (int j = i+1; j <= line.length(); j++) {
                System.out.println(line.substring(i,j));
            }
        }
    }
    public static ArrayList<Integer> find_all_occ(String line, String pattern)
    {
        //int a = pattern.length();

        ArrayList<Integer> list = new ArrayList<>();
//
        int next = line.indexOf(pattern);
        while(next != -1)
        {
            list.add(next);
            next = line.indexOf(pattern, next + 1);
        }
        return list;

    }
}

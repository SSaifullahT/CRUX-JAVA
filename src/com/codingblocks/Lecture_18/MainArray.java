package com.codingblocks.Lecture_18;

public class MainArray {
    public static void main(String[] args) {
        HTArrayList<String, Integer> dict = new HTArrayList<>();
        dict.put("apple1", 20);
        dict.put("banana1", 5);
        dict.put("apple2", 20);
        dict.put("banana2", 5);
        dict.put("apple3", 20);
        dict.put("banana3", 5);
        dict.put("apple4", 20);
        dict.put("banana4", 5);
        dict.put("apple5", 20);
        dict.put("banana5", 5);


        System.out.println(dict.get("apple1"));
        System.out.println(dict.get("apple2"));
        System.out.println(dict.get("apple3"));
        System.out.println(dict.get("apple4"));
        System.out.println(dict.get("apple5"));
        System.out.println(dict.get("banana1"));
        System.out.println(dict.get("banana2"));
        System.out.println(dict.get("banana3"));
        System.out.println(dict.get("banana4"));
        System.out.println(dict.get("banana5"));
//
//        dict.remove("apple");
//        System.out.println(dict.get("apple"));

    }
}

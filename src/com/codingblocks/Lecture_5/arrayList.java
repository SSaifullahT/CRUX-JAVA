package com.codingblocks.Lecture_5;

import java.util.ArrayList;

public class arrayList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //System.out.println(list.size());
        list.add(5);
        list.add(6);
        list.add(66);
        list.set(2, 77);

        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }

    }
}

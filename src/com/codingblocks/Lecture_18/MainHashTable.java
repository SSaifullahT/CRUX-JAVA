package com.codingblocks.Lecture_18;

public class MainHashTable {
    public static void main(String[] args) {
        HashTable<Integer, Integer> table = new HashTable<>();

        for (int i = 0; i < 100000; i++) {
            table.put(i,i);
        }
    }
}

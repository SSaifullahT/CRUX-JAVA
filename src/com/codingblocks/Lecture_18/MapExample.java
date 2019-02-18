package com.codingblocks.Lecture_18;

import java.util.HashMap;
import java.util.HashSet;

public class MapExample {
    public static void main(String[] args) {
       String line = "hello my name is saif";
       HashMap<Character, Integer> map = freq(line);

        //HashSet<Integer> set = new HashSet<>();

        System.out.println(map);
    }

    public static HashMap<Character, Integer> freq(String line){
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);

            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            }else {
                map.put(ch,1);
            }
        }
        return map;
    }
}

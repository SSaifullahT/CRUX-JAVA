package com.codingblocks.Lecture_7;

import java.util.ArrayList;
import java.util.Arrays;

public class RecReturn {
    public static void main(String[] args) {
       ArrayList<String> result = printsubsequence1("", "happy");
//        ArrayList<String> a = new ArrayList<>();
//        printsubsequence("","abc",a);
//        System.out.println(a);
        System.out.println(result);
//        ArrayList<String> b = numpad("","21");
//        System.out.println(b);
    }
    public static void printsubsequence(String processed, String unprocessed, ArrayList<String> list){
        if(unprocessed.isEmpty()){
            if(!processed.isEmpty()) {
                list.add(processed);

            }
            //System.out.println(list);


            return;
        }

        char first = unprocessed.charAt(0);
        unprocessed = unprocessed.substring(1);

        printsubsequence(processed + first, unprocessed, list);
        printsubsequence(processed,unprocessed,list);

    }

    public static ArrayList<String> printsubsequence1(String processed, String unprocessed){

        if(unprocessed.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            if(!processed.isEmpty()) {

                list.add(processed);
            }
            return list;
        }

        char first = unprocessed.charAt(0);
        unprocessed = unprocessed.substring(1);

        ArrayList<String> left = printsubsequence1(processed + first, unprocessed);
        ArrayList<String> right = printsubsequence1(processed,unprocessed);
        left.addAll(right);

        return left;
    }
    public static ArrayList<String > numpad(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            return list;
        }

        int digit = unprocessed.charAt(0) -'0';

        unprocessed = unprocessed.substring(1);
        ArrayList<String> list = new ArrayList<>();

        for (int i = 3 * (digit - 1); i < 3 * digit ; i++) {
            if (i == 26) {
                continue;
            }
            char ch = (char)(i + 'a');
            list.addAll(numpad(processed + ch, unprocessed));
        }
        return list;
    }

}

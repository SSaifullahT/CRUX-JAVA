package com.codingblocks.Lecture_7;

import java.util.Scanner;

public class SequenceRecurssion {
    public static void main(String[] args) {
       // Scanner s = new Scanner(System.in);
        //String line = s.nextLine();

        //printsubsequence("", line);
       // printsubsequenceACII("",line);
        //numpad("","21");
        //permutationString("", "abc");
        //dice("", 10);
       // diceBuilder(new StringBuilder(),100);
        permuteBuilder(new StringBuilder(), new StringBuilder("abc") );

    }

    public static void printsubsequence(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            if(!processed.isEmpty()) {
                System.out.println(processed);
            }
            return;
        }

        char first = unprocessed.charAt(0);
        unprocessed = unprocessed.substring(1);

        printsubsequence(processed + first, unprocessed);
        printsubsequence(processed,unprocessed);

    }

    public static void printsubsequenceACII(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            if(!processed.isEmpty()) {
                System.out.println(processed);
            }
            return;
        }

        char first = unprocessed.charAt(0);
        unprocessed = unprocessed.substring(1);

        printsubsequenceACII(processed + first, unprocessed);
        printsubsequenceACII(processed,unprocessed);
        printsubsequenceACII(processed + (int)first, unprocessed);

    }

    public static void numpad(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        int digit = unprocessed.charAt(0) -'0';

        unprocessed = unprocessed.substring(1);

        for (int i = 3 * (digit - 1); i < 3 * digit ; i++) {
            if (i == 26) {
                continue;
            }
            char ch = (char)(i + 'a');
            numpad(processed + ch, unprocessed);
        }
    }

    public static void permutationString(String processed, String unprocessed){
     if(unprocessed.isEmpty()){
         System.out.println(processed);
         return;
     }
     char ch = unprocessed.charAt(0);
     unprocessed = unprocessed.substring(1);

        for (int i = 0; i <= processed.length() ; i++) {
            String first = processed.substring(0,i);
            String last = processed.substring(i);

            permutationString(first + ch + last, unprocessed);
        }
    }

    public static void dice(String processed, int target){
        if(target == 0){
            System.out.println(processed);
            return;
        }

        for (int i = 1; i <= 6 && i <=target; i++) {
            dice(processed + i, target - i);
        }
    }
    public static void diceBuilder(StringBuilder processed, int target){
        if(target == 0){
            System.out.println(processed);
            return;
        }

        for (int i = 1; i <= 6 && i <=target; i++) {
            processed.append(i);
            diceBuilder(processed, target - i);
            processed.deleteCharAt(processed.length() - 1);
        }
    }
    public static void permuteBuilder(StringBuilder processed, StringBuilder unprocessed){
        if(unprocessed.length() == 0){
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        unprocessed.deleteCharAt(0);
        for (int i = 0; i <= processed.length() ; i++) {
            processed.insert(i,ch);
            permuteBuilder(processed,unprocessed);
            processed.deleteCharAt(i);
        }
        unprocessed.insert(0, ch);
    }
}

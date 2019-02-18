package com.codingblocks.Lecture_14;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       // permutation("","abc");
        //System.out.println(Arrays.toString(frequency("aabdsfserasdfrfertubvzdashjkljo")));
//        String line = "aabde";
//        int[] f = frequency(line);

       // lexograpgical("",f,line.length());

       // lexoNumber(0,5,200);
        //traingleUP(5,0);
        //pascalTraingle(5,0);
       // System.out.println(automata("abba",0));
        int[] arr = {0,1,2,3,4};
          sets(arr, 0,new ArrayList<>(),new ArrayList<>(),0,0);
    }
    public static void permutation(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        unprocessed = unprocessed.substring(1);
        for (int i = 0; i <= processed.length() ; i++) {
            permutation(processed.substring(0,i) + ch + processed.substring(i), unprocessed);
        }
    }

    public static int[] frequency(String line){
        int[] nums = new int[26];

        line = line.toLowerCase();
        for (int i = 0; i < line.length() ; i++) {
            int pos = line.charAt(i) - 'a';
            nums[pos]++;
        }

        return nums;
    }

    public static void lexograpgical(String processed, int[] freq, int len){
        if(processed.length() == len){
            System.out.println(processed);
            return;
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0){
                char ch = (char)('a' + i);
                freq[i]--;
                lexograpgical(processed + ch, freq, len);
                freq[i]++;
            }
        }
    }

    public static void lexoNumber(int processed, int min, int max){
        for (int i = 0; i < 10; i++) {
            if(processed == 0 && i == 0){
                continue;
            }
            int num = processed * 10 + i;
            if(num <= max) {
                if(num > min) {
                    System.out.println(num);
                }
                lexoNumber(num,min, max);
            }
        }
    }
    public static void traingleUP(int row, int column){
        if(row == 0){
            return;
        }
        if(row == column){
            traingleUP(row - 1, 0);
            System.out.println();

            return;
        }
        traingleUP(row,column + 1);
        System.out.print("* ");

    }
    public static int pascalTraingle(int row, int column){
        if(row == -1){
            return 1;
        }
        if(row + 1 == column){
            pascalTraingle(row - 1, 0);
            System.out.println();

            return 1;
        }
        int val = pascalTraingle(row,column + 1);
        System.out.print(val + " ");
        return val * (column)/(row - column + 1);
    }

    public static boolean automata(String line, int index){
        if(index == line.length()){
            return true;
        }
        if(line.charAt(0) != 'a'){
            return false;
        }
        if (line.startsWith("a",index)){
            if(!line.startsWith("a",index + 1)||line.startsWith("bb",index + 1) || index == line.length() - 1){
                return false;
            }else {
                return automata(line,index + 1);
            }
        }
        if (line.startsWith("bb",index)){
            if(!line.startsWith("a",index + 2)|| index == line.length() - 2){
                return false;
            }else {
                return automata(line,index + 2);
            }
        }
        return automata(line,index + 1);
    }

//    public static boolean isBalanced(String processed, String line, int index){
//        if(index == line.length()){
//            if(processed.isEmpty()){
//                return true;
//            }
//            return false;
//        }
//        char f = line.charAt(index);
//        if(f == '(' || f == '{' || f == '['){
//            return isBalanced(processed + f, line, index + 1);
//        }
//    }
    //Dividing array in 2 so that sum are equal.
   public static void sets(int[] nums, int index, ArrayList<Integer> first, ArrayList<Integer> second,int f_sum, int s_sum){
        if(index == nums.length){
            if(f_sum == s_sum){
                System.out.println(first + " - " + second);
            }
            return;
        }
        first.add(nums[index]);
        sets(nums,index + 1, first, second,f_sum + nums[index], s_sum);
        first.remove(first.size() - 1);

       second.add(nums[index]);
       sets(nums,index + 1, first, second,f_sum, s_sum+ nums[index]);
       second.remove(second.size() - 1);


   }

}

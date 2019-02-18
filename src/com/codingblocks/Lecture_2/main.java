package com.codingblocks.Lecture_2;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello from Coding Blocks");
//        int principle=56;
//        int rate=5;
//        int time=4;
//        int si=(principle*rate*time)/100;
//        System.out.println(si);
        Scanner s = new Scanner(System.in);
        //int a = s.nextInt();
        //System.out.println(a);
        int n =s.nextInt();
        int row =0;
        while(row<n){
            int col =0;
            while(col<=row) {
                System.out.print("* ");
                col++;
            }
            System.out.println();
            row++;
        }
    }
}

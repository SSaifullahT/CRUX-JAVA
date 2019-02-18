package com.codingblocks.Lecture_6;

import java.util.Scanner;

public class PatternWithRecursion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        // pattern(n,0);
        //pattern2(n, 0);
        pattern1(n,0,n);
    }
    public static void pattern(int row, int column)
    {
        if(row == 0){
            return;
        }
        if(row == column){
            System.out.println();
            pattern(row - 1, 0);
            return;
        }
        System.out.print("* ");
        pattern(row, column + 1);
    }
    public static void pattern2(int row, int column)
    {
        if(row == 0){
            return;
        }
        if(row == column){

            pattern2(row - 1, 0);
            System.out.println();
            return;
        }

        pattern2(row, column + 1);
        System.out.print("* ");
    }
    public static void pattern1(int row, int column, int n){
        if(row == 0){
            return;
        }
        if(column == n + 1 - row){
            System.out.println();
            pattern1(row - 1, 0,n);
            return;
        }
        System.out.print("* ");
        pattern1(row,column + 1,n);

    }
}

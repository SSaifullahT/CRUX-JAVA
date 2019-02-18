package com.codingblocks.Lecture_3;

import java.util.Scanner;

public class InverseOfNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        System.out.println(inverse(n));

    }
    public static int inverse(int n)
    {
        int new_num = 0;
        int place =1;
        int value;
        while(n>0)
        {
            value = n % 10;
            n= n/10;
            new_num = new_num + (int)Math.pow(10,value -1)*place;
            place++;
        }
        return new_num;
    }
}

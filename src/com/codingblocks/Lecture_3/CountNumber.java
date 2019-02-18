package com.codingblocks.Lecture_3;

import java.util.Scanner;

public class CountNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int k = s.nextInt();
        System.out.println(count(n,k));
    }
    public static int count(int n, int k)
    {
        int count =0;
        int t;
        while (n > 0)
        {
            t= n%10;
            n= n/10;
            if(t == k)
            {
                count++;

            }


        }
        return count;
    }
}

package com.codingblocks.Lecture_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int start = s.nextInt();
        int end = s.nextInt();
        int step = s.nextInt();

        temperature(start,end,step);
    }

    public static void temperature(int start, int end, int step){
        while (start <= end)
        {
            float c = (5/9f) * (start - 32);
            System.out.printf("%.2f\n",c);
            start = start + step;
        }


    }
}

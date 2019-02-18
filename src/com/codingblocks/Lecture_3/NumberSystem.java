package com.codingblocks.Lecture_3;

import java.util.Scanner;

public class NumberSystem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int k = s.nextInt();
        System.out.println(deciToBin(n));
        System.out.println(deciToany(n,m));
        System.out.println(binToDeci(n));
        System.out.println(anyToDeci(n,m));
        System.out.println(any2any(n,m,k));
    }
    public static int deciToBin(int deci){
        int bin = 0;
        int place = 1;
        while (deci>0)
        {
            int r = deci%2;
            deci = deci/2;
            bin = bin+ r*place;
            place=place*10;
        }
        return bin;
    }
    public static int deciToany(int deci, int t_base)
    {
        int any =0;
        int place =1;
        while (deci>0)
        {
            int r = deci%t_base;
            deci = deci/t_base;
            any = any+ r*place;
            place=place*10;
        }
        return any;

    }
    public static int binToDeci(int bin)
    {
        int dec = 0;
        int t = 1;
        while(bin > 0)
        {
            int r = bin % 10;
            bin = bin/10;
            dec = dec + t * r;
            t = t * 2;
        }
        return dec;
    }
    public static int anyToDeci(int any, int base)
    {
        int dec = 0;
        int t = 1;
        while(any > 0)
        {
            int r = any % 10;
            any = any/10;
            dec = dec + t * r;
            t = t * base;
        }
        return dec;
    }
    public static int any2any(int value, int s_base, int t_base)
    {
        int decimal = anyToDeci(value, s_base);
        return deciToany(decimal,t_base);
    }
}

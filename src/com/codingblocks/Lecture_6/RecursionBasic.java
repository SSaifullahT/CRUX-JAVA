package com.codingblocks.Lecture_6;

import java.math.BigInteger;

public class RecursionBasic {
    public static void main(String[] args) {
        //pdi(5);
        //fatorial (100);
        System.out.println(fatorial(10));
        //pi(5);
        //System.out.println(pow(2,3));
        //BigInteger result = powBig(100, 8);
        //System.out.println(result);
    }
    public static void pdi(int n)
    {
        if(n == 0) {
            return;
        }
        System.out.println(n);
        pdi(n -1);
        System.out.println(n);
    }
    public static void pi(int n)
    {
        if(n == 0) {
            return;
        }
        pi(n -1);
        System.out.println(n);

    }
    public static int pow(int x, int n){

        if(n == 0){
            return 1;
        }
        return x * pow(x,n -1);
    }
    public static BigInteger powBig(int x, int n){
        if(n==0){
            return new BigInteger("1");
        }
        return new BigInteger(Integer.toString(x)).multiply(powBig(x,n-1));

    }
    public static BigInteger fatorial(int n)
    {
        if(n==0){
            return BigInteger.ONE;
        }
        return new BigInteger(Integer.toString(n)).multiply(fatorial(n-1));

    }
    public static BigInteger fibonaci(int n)
    {
        if(n < 2)
        {
            return new BigInteger(Integer.toString(n));
        }
        //BigInteger val = (fatorial(n -1));
        return fibonaci(n -1).add(fibonaci(n-2));
    }
}

package com.codingblocks.Lecture_5;

public class Builder_example {
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("a");
        String first = "Abba";
//        System.out.println("Process start");
//        for (int i = 0; i <100000 ; i++) {
//            a.append("a");
//        }
//
//        System.out.println("Process end");
        System.out.println(toggle(first));
        System.out.println(oddeven(first));
    }
    public static String toggle(String line)
    {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < line.length() ; i++) {
            char ch = line.charAt(i);
            if(ch >= 'a' && ch <= 'z')
            {
                if(ch=='a')
                    ch = 'z';
                else if(ch =='A')
                    ch = 'Z';
                ch = (char)('A' + ch - 'a');
            }
            else if(ch >= 'A' && ch <= 'Z')
            {
                ch = (char)('a' + ch - 'A');
            }
            builder.append(ch);
        }
        return builder.toString();
    }
    public static String oddeven(String line)
    {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            if(i % 2 == 0)
            {
               ch = (char)(ch - 1);
            }
            else
            {
                ch = (char)(ch + 1);
            }
        }
        return builder.toString();
    }
}

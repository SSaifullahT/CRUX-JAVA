package com.codingblocks.Lecture_5;

public class String_examples {
    public static void main(String[] args) {
        String first = "naman";
        String second = "ammbmbaa";
        System.out.println(Palindrome(first));
        count_substring_palindrome(second);
    }
    public static boolean Palindrome(String line)
    {
        for (int i = 0; i < line.length() / 2 ; i++) {
            if(line.charAt(i) != line.charAt(line.length() - i - 1))
                return false;
        }
        return true;
    }
    public static void count_substring_palindrome(String line)
    {
        int count = 0;
        for (int i = 0; i < line.length() ; i++) {
            int left = i;
            int right = i;
            while(left >= 0 && right < line.length() && line.charAt(left) == line.charAt(right))
            {
                count++;
                left--;
                right++;
            }
        }
        for (int i = 0; i < line.length() ; i++) {
            int left = i;
            int right = i + 1;
            while (left >= 0 && right < line.length() && line.charAt(left) == line.charAt(right)) {
                count++;
                left--;
                right++;
            }
        }
        System.out.println(count);
    }
}

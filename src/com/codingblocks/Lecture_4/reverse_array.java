package com.codingblocks.Lecture_4;

public class reverse_array {
    public static void main(String[] args) {
        int[] arr ={2, 5, 6, 8, 9};
        reverse(arr);
    }

    public static void reverse(int[] arr)
    {
        for (int i = 0; i < arr.length / 2 ; i++) {
            array.swap(arr,i,arr.length-1-i);
        }
        array.display(arr);
    }
}

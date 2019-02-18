package com.codingblocks.Lecture_5;

public class array_2D {
    public static void main(String[] args) {
//        int [][] nums = new int[5][];
//        for (int i = 0; i <nums.length ; i++) {
//            System.out.println(nums[i]);
//        }
        int [][] nums = {{1, 2, 3, 4, 5},{11, 12, 13, 14, 15},{21, 22, 23, 24, 25}};
        for (int i = 0; i < nums.length ; i++) {
            int[] row = nums[i];
            for (int j = 0; j < row.length ; j++) {
                System.out.print(row[j] + " ");
            }
            System.out.println();
        }
    }
}

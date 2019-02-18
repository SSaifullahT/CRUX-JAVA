package com.codingblocks.Lecture_6;

public class main {
    public static void main(String[] args) {
        int[][] nums = {
                {1, 2, 3, 4},
                {11, 12, 13, 14},
                {21, 22, 23, 24},
                {31, 32, 33, 34}
        };
        spireal_print(nums);
    }
    public static void spireal_print(int[][] nums)
    {
        int left = 0;
        int right = nums[0].length - 1;
        int top = 0;
        int bottom = nums.length - 1;

        while(left <= right && top <= bottom)
        {
            for (int c = left; c <= right ; c++) {
                System.out.print(nums[top][c] + " ");
            }
            top++;
            for (int r = top; r <= bottom ; r++) {
                System.out.print(nums[r][right] + " ");
            }
            right--;
            for (int c = right; c >= left ; c--) {
                System.out.print(nums[bottom][c] + " ");
            }
            bottom--;
            for (int r = bottom; r >= top ; r--) {
                System.out.print(nums[r][left] + " ");
            }
            left++;
        }
    }
}

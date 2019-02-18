package com.codingblocks.Lecture_4;

public class Inverse_of_array {
    public static void main(String[] args) {
        int[] nums = {1, 2, 0, 4, 3};
        int[] inv = inverse_array(nums);
        array.display(inv);
    }

    public static int[] inverse_array(int[] nums)
    {
        int[] result = new int[nums.length];
        for (int p = 0; p <nums.length ; p++) {
            int v = nums[p];
            result[v] = p;
        }
        return result;
    }
}

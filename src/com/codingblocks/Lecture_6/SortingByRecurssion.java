package com.codingblocks.Lecture_6;

import java.util.Arrays;

public class SortingByRecurssion {
    public static void main(String[] args) {
        int[] nums = {1, 5, 4, 9, 2};
        bubbleSort(nums,0,nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }
    public static void bubbleSort(int[] nums, int first, int last){
        if(last == 0){
            return ;
        }
        if(first == last){
            bubbleSort(nums,0,last - 1);
            return ;
        }
        if(nums[first] > nums[first + 1]){
            int temp = nums[first];
            nums[first] = nums[first + 1];
            nums[first + 1] = temp;
        }
        bubbleSort(nums,first + 1, last);
    }
}

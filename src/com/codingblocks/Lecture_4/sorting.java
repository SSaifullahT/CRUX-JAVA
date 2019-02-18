package com.codingblocks.Lecture_4;

import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        int[] nums = { 342, 567, 67, 35, 68, 456, 57};
        bubble_sort(nums);
        selection_sort(nums);
        insertion_sort(nums);
    }

    public static void bubble_sort(int[] nums)
    {
        int temp;
        for (int i = 0; i <nums.length -1 ; i++) {
            for (int j = 0; j <nums.length-1-i ; j++) {
                if(nums[j] > nums[j + 1]) {
                    array.swap(nums,j, j+1);
                }
            }
        }
        //array.display(nums);

        System.out.println(Arrays.toString(nums));;
    }

    public static void selection_sort(int[] nums)
    {
        for (int i = 0; i <nums.length - 1 ; i++) {

            int maxIndex = array.max_index_in_range(nums,0,nums.length - i - 1);
            array.swap(nums,maxIndex,nums.length-i-1);
        }
        array.display(nums);
    }

    public static void insertion_sort(int[] nums)
    {
        for (int i = 0; i <nums.length ; i++) {
            for (int j = i; j > 0 ; j--) {
                if(nums[j] < nums[j - 1])
                    array.swap(nums,j,j-1);
                else
                    break;
            }
        }
        array.display(nums);
    }

}

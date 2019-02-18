package com.codingblocks.Lecture_4;

import java.sql.SQLOutput;
import java.util.Arrays;

public class array {
    public static void main(String[] args) {

        //int[] nums = new int[10];
        int[] nums ={21, 54, 77, 47, 56, 87, 25};
        int[] ben ={100, 54, 87, 47, 56, 87, 24};
        nums[6] = 37;
       // System.out.println(nums[6]);
        display(nums);
        swap(nums,1,2);
        display(nums);
        System.out.println(max_index_in_range(nums,0,6));
        Arrays.sort(nums);
        display(nums);
        compare_array(nums,ben);

       // System.out.println(Arrays.toString(nums));
        System.out.println(linear_search(nums,47));
        System.out.println(binary_search(nums, 87));
        System.out.println(binary_neaest(nums, 30));
    }
    public static void swap(int[] nums, int first, int second)
    {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

    public static void display(int[] nums)
    {
        System.out.print("[");
        for (int i = 0; i <nums.length ; i++) {

            if(i<(nums.length)-1)
            {
                System.out.print(nums[i] + ", ");
            }
            else
                System.out.print(nums[i]);
        }
        System.out.println("]");
    }
    public static int linear_search(int[] nums, int target)
    {
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i] == target)
                return i;

        }
        return -1;
    }
    public static int binary_search(int[] nums, int target)
    {
        int start = 0;
        int end = nums.length - 1;
        while(start <= end)
        {
            int mid = (start + end)/2;
            if(nums[mid]== target)
                return mid;
            else if(nums[mid] > target)
            {
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }

        }
        return -1;
    }
    public static int binary_neaest(int[] nums, int target)
    {
        int start = 0;
        int end = nums.length - 1;
        while(start <= end)
        {
            int mid = (start + end)/2;
            if(nums[mid]== target)
                return mid;
            else if(nums[mid] > target)
            {
                if(mid -1 >= 0 && nums[mid - 1] < target)
                {
                    if(target - nums[mid - 1] > nums[mid] - target )
                    {
                        return mid;
                    }
                    else
                        return mid -1;
                }
                else
                    end = mid - 1;
            }
            else{
                if(mid +1 < nums.length && nums[mid+1] > target)
                {
                    if(target - nums[mid] > nums[mid + 1] - target)
                        return mid+1;
                    else
                        return mid;
                }
                else
                    start = mid + 1;
            }

        }
        return -1;
    }
    public static int max_index_in_range(int[] nums, int start, int end)
    {
        int max = start;
        for (int i = 0; i <= end; i++) {
            if(nums[i] > nums[max])
            {
                max = i;
            }

        }
        return max;
    }
    public static boolean compare_array(int[] first, int[] second)
    {
        if(first.length != second.length){
            return false;
        }
        for (int i = 0; i <first.length ; i++) {
            if(first[i] != second[i])
                return false;
        }
        return true;
    }
}

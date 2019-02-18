package com.codingblocks.Lecture_6;

import java.util.Arrays;

public class ArrayRecurssionExamples {
    public static void main(String[] args) {
        int[] nums ={1, 3, 2, 4, 5};
        System.out.println(find(nums,0,7));
        System.out.println(FindIndex(nums,0,4));
        int[] numss = {1, 1, 2, 2, 3, 4, 3, 5};
        System.out.println(Arrays.toString(findAllIndex(numss,0,3,0)));
    }
    public static boolean find(int[] nums, int index, int target){
        if(index == nums.length){
            return false;
        }
        return nums[index] == target || find(nums, index + 1, target);
    }
    public static int FindIndex(int[] nums, int index, int taget){
        if(index == nums.length){
            return -1;
        }
        if(nums[index] == taget){
            return index;
        }
        return FindIndex(nums,index+1,taget);
    }
    public static int[] findAllIndex(int[] nums, int index, int target, int count){
        if(index == nums.length){
            return new int[count];
        }
        if(nums[index] == target){
            int[] result =  findAllIndex(nums,index + 1,target, count + 1);
            result[count] = index;
            return result;
        }
        return findAllIndex(nums,index+1,target,count);

    }
}

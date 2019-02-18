package com.codingblocks.Lecture_6;

public class SortingByRecursion {
    public static void main(String[] args) {
        int[] nums ={1, 3, 2, 4, 5};
        System.out.println(isSorted(nums, nums.length - 1));
    }
    public static boolean isSorted(int[] nums, int index)
    {
        if(index == 0){
            return true;
        }
//        boolean present = nums[index] >= nums[index - 1];
//        boolean sub = isSorted(nums, index - 1);
//        return present && sub;
        return nums[index] >= nums[index - 1] && isSorted(nums, index -1);
    }

}

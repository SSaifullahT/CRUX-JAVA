package com.codingblocks.Lecture_9;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums ={5, 1, 3, 2, 6 ,4};
        System.out.println(Arrays.toString(mergesort(nums)));
    }
    public static int[] mergesort(int[] nums){
        if(nums.length <= 1){
            return nums;
        }
        int mid = nums.length / 2;
        int[] first = Arrays.copyOfRange(nums,0,mid);
        int[] second = Arrays.copyOfRange(nums,mid,nums.length);

        first = mergesort(first);
        second = mergesort(second);

        return merge(first,second);

    }

    private static int[] merge(int[] first, int[] second) {
        int[] arr = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < (first.length) && j <(second.length)){
            if(first[i] < second[j]){
                arr[k++] = first[i++];
            }
            else {
                arr[k++] = second[j++];
            }

        }

        while (i < first.length){
            arr[k++] = first[i++];

        }


        while (j < second.length){
                arr[k++] = second[j++];

            }

       return arr;
    }

}

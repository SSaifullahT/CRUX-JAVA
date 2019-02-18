package com.codingblocks.Lecture_19;

import java.util.Arrays;

public class MainSort {
    public static void main(String[] args) {
//        Integer[] arr = {547, 785, 76, 9745, 5};
//        HeapSort.sort(arr);
//        System.out.println(Arrays.toString(arr));

        Human[] humans = {new Human("Saif",23,1000), new Human("Sajil", 24, 2000)};
        Arrays.sort(humans);
        System.out.println(Arrays.toString(humans));
    }
}

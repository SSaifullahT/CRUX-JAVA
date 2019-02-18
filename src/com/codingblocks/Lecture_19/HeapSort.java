package com.codingblocks.Lecture_19;

public class HeapSort {

    public static <T extends Comparable<T>> void sort(T[] arr){
        Heap<T> heap = new Heap<>();

        for (int i = 0; i < arr.length; i++) {
            heap.add(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = heap.remove();
        }
    }
}

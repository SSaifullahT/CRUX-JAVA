package com.codingblocks.Lecture_19;

import java.util.PriorityQueue;

public class MainHeap {
    public static void main(String[] args) {
        Heap<Integer> queue = new Heap<>();
        queue.add(7);
        queue.add(4);
        queue.add(3);
        queue.add(6);
        queue.add(5);
        //It will get automatically sorted
 //       while (!queue.isEmpty()) {
            System.out.println(queue.remove());
   //     }
        queue.add(1);
        System.out.println(queue.remove());
        System.out.println(queue.remove());

    }
}

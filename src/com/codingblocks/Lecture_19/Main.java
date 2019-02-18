package com.codingblocks.Lecture_19;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
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

package com.codingblocks.Lecture_13;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExamples {
    public static void main(String[] args) {
//        LinkedList<Integer> list = new LinkedList<>();
//        Queue<Integer> queue = list;
        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        System.out.println(queue);
        reverseRec(queue);

        System.out.println(queue);
    }
//    public static void reverse(Queue<Integer> queue){
//        reverseRec(queue);
//    }

    public static void reverseRec(Queue<Integer> queue){
        if(queue.isEmpty()){
            return;
        }

        int item = queue.remove();
        reverseRec(queue);
        queue.add(item);
    }
}

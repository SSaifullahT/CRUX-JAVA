package com.codingblocks.Lecture_12;

import com.codingblocks.Lecture_11.Queue;

public class QueueClient extends Queue {
    public static void main(String[] args) {
        Queue queue =new DynamicQueue();

        for (int i = 0; i < 1000 ; i++) {
            queue.insert(i);
        }

        queue.display();
    }
}

package com.codingblocks.Lecture_12;

import com.codingblocks.Lecture_11.QueueCircular;

public class DynamicQueue extends QueueCircular {

    @Override
    public void insert(int item) {
        if(isFull()){
            int[] temp = new int[data.length * 2];

            for (int i = 0; i < data.length ; i++) {
                temp[i] = data[(front + i) % data.length];
            }

            front = 0;
            end = data.length - 1;

            data = temp;
        }
        super.insert(item);
    }
}

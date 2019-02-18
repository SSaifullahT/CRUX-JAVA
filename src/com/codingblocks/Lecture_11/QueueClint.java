package com.codingblocks.Lecture_11;

public class QueueClint {
    public static void main(String[] args) {
        Queue queue = new Queue();
        for (int i = 0; i < 10; i++) {
            int num = (int)(Math.random() * 1000);
            queue.insert(num);
            queue.display();
        }
        try {
            while (!queue.isEmpty()){
                System.out.println(queue.delete());
                queue.display();
            }
        } catch (Exception e){
            //System.out.println(e.getMessage());

            e.getStackTrace();
        }


    }

}

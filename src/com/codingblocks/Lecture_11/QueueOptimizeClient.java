package com.codingblocks.Lecture_11;

public class QueueOptimizeClient {
    public static void main(String[] args) {
        QueueOptimized queueOptimize = new QueueOptimized();
        for (int i = 0; i < 10; i++) {
            int num = (int)(Math.random() * 1000);
            queueOptimize.insert(num);
            queueOptimize.display();
        }
        try {
            while (!queueOptimize.isEmpty()){
                System.out.println(queueOptimize.delete());
                queueOptimize.display();
            }
        } catch (Exception e){
            //System.out.println(e.getMessage());

            e.getStackTrace();
        }
        for (int i = 0; i < 10; i++) {
            int num = (int)(Math.random() * 1000);
            queueOptimize.insert(num);
            queueOptimize.display();
        }


    }
}

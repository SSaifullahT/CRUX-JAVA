package com.codingblocks.Lecture_11;

public class QueueCircularClient {
    public static void main(String[] args) {
        QueueCircular queueCircular = new QueueCircular();
        for (int i = 0; i < 10; i++) {
            int num = (int)(Math.random() * 1000);
            queueCircular.insert(num);
            queueCircular.display();
        }
        try {
            while (!queueCircular.isEmpty()){
                System.out.println(queueCircular.delete());
                queueCircular.display();
            }
        } catch (Exception e){
            //System.out.println(e.getMessage());

            e.getStackTrace();
        }
        for (int i = 0; i < 10; i++) {
            int num = (int)(Math.random() * 1000);
            queueCircular.insert(num);
            queueCircular.display();
        }

    }
}

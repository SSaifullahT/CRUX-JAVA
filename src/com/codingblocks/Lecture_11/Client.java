package com.codingblocks.Lecture_11;

public class Client {
    public static void main(String[] args) {
        WonderCar myCar = new WonderCar();

       //System.out.println(myCar.engines);
       // System.out.println(myCar.windows);

       // myCar.random();

        for (int i = 0; i < 8 ; i++) {
            myCar.start();
            myCar.stop();
        }
        myCar.fly();

    }
}

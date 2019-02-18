package com.codingblocks.Lecture_13;

public class Client {
    public static void main(String[] args) {
        Car my_car = new Audi(new PetrolEngine());
        my_car.start();
        my_car.steer("left");
        my_car.steer("right");
        my_car.steer("left");
        my_car.brake();
        my_car.stop();

        NormalSterring sterring = new NormalSterring();

        my_car.changeSteering(sterring);
        my_car.start();
        my_car.steer("left");
        my_car.steer("right");
        my_car.steer("left");
        my_car.brake();
        my_car.stop();

        Brake b = new Brake() {
            @Override
            public void brake() {
                System.out.println("Like ABS break");
            }
        };
    }
}

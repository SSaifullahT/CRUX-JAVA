package com.codingblocks.Lecture_11;

public class WonderCar extends Car {

    public int engines = 2;
    public Engine engine;


    public WonderCar(){

        engine = new PetrolEngine();
    }
    @Override//to check weather it is overriding or not
    public void start(){// for override same name and same parameter as parent class
        //super.start();//super for the parent class method
        System.out.println("Start With Extra Noise");
        engine.start();
    }

    public void stop(){// for override same name and same parameter as parent class
        //super.start();//super for the parent class method
        System.out.println("Stop With Extra Noise");
        engine.stop();
    }

    public void random(){

        System.out.println(super.engines);
    }
    public void changeEngine(){
        engine = new PetrolEngine();
    }
    public void fly(){
        System.out.println("Udta Fir");
    }
}

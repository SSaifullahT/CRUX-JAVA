package com.codingblocks.Lecture_11;

public class Engine {

    public int cycles = 0;
    public void start(){
        if(cycles > 5){
            System.out.println("Can not start");
            return;
        }
        System.out.println("Strat like nomal Engine");
        cycles++;
    }
    public void stop(){

        System.out.println("Stop like normal Engine");
    }
}

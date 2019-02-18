package com.codingblocks.Lecture_11;

public class PetrolEngine extends Engine {
    public int rpm = 0;
    public int start;
    public void start()
    {
        if(cycles > 7){
            System.out.println("Can not start");
            return;
        }
        cycles++;

        System.out.println("Strat like petrol Engine");
    }

    public void start(int rpm){
        this.rpm = rpm;
        System.out.println("starting with rpm" + rpm);
    }
    public void stop()
    {
        System.out.println("Stop like petrol Engine");
    }


}

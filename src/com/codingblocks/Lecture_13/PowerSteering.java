package com.codingblocks.Lecture_13;

public class PowerSteering implements Steering {
    @Override
    public void steer(String direction) {
        System.out.println("Steering softly with brand new power steering to" + direction);
    }
}

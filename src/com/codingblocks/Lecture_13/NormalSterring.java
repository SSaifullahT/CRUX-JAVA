package com.codingblocks.Lecture_13;

public class NormalSterring implements Steering{
    @Override
    public void steer(String direction) {
        System.out.println("Steering softly with old power steering to " + direction);

    }
}

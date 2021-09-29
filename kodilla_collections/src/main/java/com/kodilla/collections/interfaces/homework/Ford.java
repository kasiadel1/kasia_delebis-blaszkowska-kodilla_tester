package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {


    int speed;
    int accelerate;
    int brake;


    public Ford(int speed, int accelerate, int brake) {
        this.speed = speed;
        this.accelerate= accelerate;
        this.brake = brake;

    }
    @Override
    public int getSpeed() {


        return speed  + increaseSpeed() - decreaseSpeed();
    }

    @Override
    public int increaseSpeed() {

        return speed + 3* accelerate;
    }


    @Override
    public int decreaseSpeed() {

        return speed + 2 *  brake;

    }
}
package com.kodilla.collections.interfaces.homework;

public class Audi implements Car {


    int speed;
    int accelerate;
    int brake;



    public Audi(int speed, int accelarate, int brake){
        this.speed = speed;
        this.accelerate = accelarate;
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

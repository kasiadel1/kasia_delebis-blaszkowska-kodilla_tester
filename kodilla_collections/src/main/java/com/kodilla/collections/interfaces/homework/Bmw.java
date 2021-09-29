package com.kodilla.collections.interfaces.homework;

public class Bmw implements Car{

    private int speed;
    private int accelerate;
    private int brake;

    public Bmw(int speed, int accelarate, int brake){
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

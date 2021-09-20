package com.kodilla.inheritance.homework;


public class TouchScreen extends OperatingSystem {

    public TouchScreen(int yearOfRelease) {
        super(yearOfRelease);
    }

    @Override
    public void turnOn(){
        System.out.println("It's on again");
    }

}
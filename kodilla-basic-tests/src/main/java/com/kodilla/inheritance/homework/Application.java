package com.kodilla.inheritance.homework;

public class Application {
    public static void main(String[] args) {


        OperatingSystem operatingSystem = new OperatingSystem(2020);
        operatingSystem.turnOn();
        operatingSystem.turnOff();


        TouchScreen touchScreen= new TouchScreen(2021);
        touchScreen.displayYear();
        touchScreen.turnOn();


    NoTouchScreen noTouchScreen = new NoTouchScreen(2015);
    noTouchScreen.tapAndPlay();
    noTouchScreen.turnOff();
    noTouchScreen.displayYear();


    }
}

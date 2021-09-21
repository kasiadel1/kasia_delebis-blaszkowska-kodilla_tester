package com.kodilla.inheritance.homework;

public class Application {
    public static void main(String[] args) {


        OperatingSystem operatingSystem = new OperatingSystem(2020);
        operatingSystem.turnOn();
        operatingSystem.turnOff();


        Windows touchScreen= new Windows(2021);
        touchScreen.displayYear();
        touchScreen.turnOn();


    Linux noTouchScreen = new Linux(2015);
    noTouchScreen.tapAndPlay();
    noTouchScreen.turnOff();
    noTouchScreen.displayYear();


    }
}

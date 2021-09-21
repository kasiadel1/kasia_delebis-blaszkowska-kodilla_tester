package com.kodilla.inheritance.homework;

public class Application {
    public static void main(String[] args) {


        OperatingSystem operatingSystem = new OperatingSystem(2018);
        operatingSystem.turnOn();
        operatingSystem.turnOff();


        Windows windows= new Windows(2021);
       windows.displayYear();
       windows.turnOn();


    Linux linux = new Linux(2015);
    linux.tapAndPlay();
    linux.turnOff();
    linux.displayYear();


    }
}

package com.kodilla.inheritance.homework;

public class OperatingSystem {
    public int yearOfRelease;

    //dodaje konstruktor przyjmujacy rok wydania systemu operacyjnego
    public OperatingSystem(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }


    //dodaje metody

        public void turnOn () {
            System.out.println("System is on");
        }

        public void turnOff () {
            System.out.println("System is off");
        }


    public void displayYear(){
        System.out.println("Release year :" + yearOfRelease);
    }
    }


package com.kodilla.inheritance.homework;

public class OperatingSystem {
    public int yearOfRelease;

    //dodaje konstruktor przyjmujacy rok wydania systemu operacyjnego
    public OperatingSystem(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }


    //dodaje metody

        public void turnOn () {
            System.out.println("It's on");
        }

        public void turnOff () {
            System.out.println("It's off");
        }


    public void displayYear(){
        System.out.println("Release year :" + yearOfRelease);
    }
    }


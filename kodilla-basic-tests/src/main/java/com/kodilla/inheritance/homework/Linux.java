package com.kodilla.inheritance.homework;

public class Linux extends OperatingSystem {


    public Linux(int yearOfRelease) {
        super(yearOfRelease);
    }

    public void tapAndPlay(){
        System.out.println("It's tapped so i can play");
    }


@Override
    public void turnOff(){
        System.out.println("Linux is off");
    }
}

package com.kodilla.inheritance.homework;

public class NoTouchScreen extends OperatingSystem {


    public NoTouchScreen(int yearOfRelease) {
        super(yearOfRelease);
    }

    public void tapAndPlay(){
        System.out.println("It's tapped so i can play");
    }


@Override
    public void turnOff(){
        System.out.println("Sometimes on sometimes off");
    }
}

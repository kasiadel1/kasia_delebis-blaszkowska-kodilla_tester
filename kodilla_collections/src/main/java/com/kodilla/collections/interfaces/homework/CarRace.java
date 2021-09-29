package com.kodilla.collections.interfaces.homework;


public class CarRace {

    public static void main(String[] args) {


        Bmw bmw = new Bmw(10, 40, 50);
        doRace(bmw);


        Audi audi = new Audi(8, 30, 20);
        doRace(audi);

        Ford ford = new Ford(7, 23, 30);
        doRace(ford);
    }




        private static void doRace(Car car) {

            System.out.println(car.getSpeed());

        }
    }


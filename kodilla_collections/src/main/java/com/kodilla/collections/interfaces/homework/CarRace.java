package com.kodilla.collections.interfaces.homework;


public class CarRace {

    public static void main(String[] args) {


        Bmw bmw = new Bmw(110);
        doRace(bmw);


        Audi audi = new Audi(100);
        doRace(audi);

        Ford ford = new Ford(70);
        doRace(ford);
    }




        private static void doRace(Car car) {


            System.out.println(car.getSpeed());
            System.out.println(car.increaseSpeed());
            System.out.println(car.decreaseSpeed());
        }
    }


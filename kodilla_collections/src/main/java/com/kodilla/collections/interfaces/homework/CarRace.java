package com.kodilla.collections.interfaces.homework;


public class CarRace {


    public static void main(String[] args) {


        Bmw bmw = new Bmw(89);
        doRace(bmw);


  Audi audi = new Audi(108);
      doRace(audi);

        Ford ford = new Ford(70);
        doRace(ford);
    }


    private static void doRace(Car car) {
        {
          car.increaseSpeed();
          car.increaseSpeed();
          car.increaseSpeed();
          car.decreaseSpeed();
          car.decreaseSpeed();
          System.out.println(car.getSpeed());

        }
    }

}




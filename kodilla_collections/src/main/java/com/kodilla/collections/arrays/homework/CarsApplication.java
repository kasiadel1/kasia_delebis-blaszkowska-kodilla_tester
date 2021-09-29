package com.kodilla.collections.arrays.homework;


import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Bmw;
import com.kodilla.collections.interfaces.homework.Ford;

import java.util.Random;

public class CarsApplication {

    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15)+ 1];

        for (int i = 0; i < cars.length; i++)
            cars[i] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);

    }

    public static Car drawCar() {
        Random random = new Random();
        int drawCarBrand = random.nextInt(3);
        int speed = random.nextInt(10);
        if (drawCarBrand == 0)
            return new Audi(speed);

        else if (drawCarBrand == 1)
            return new Bmw(speed);
        else
            return new Ford(speed);
    }


}


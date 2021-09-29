package com.kodilla.collections.arrays.homework;


import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Bmw;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Car;


public class CarUtils {

    public static void describeCar(Car car){
        System.out.println("_____________");
        System.out.println("Car brand:  " + getCarName(car));
        System.out.println("Car increased speed: " + car.increaseSpeed());


    }





    private static String getCarName(Car car) {
        if (car instanceof Audi)
            return "Audi";
        else if (car instanceof Bmw)
            return "Bmw";
        else if (car instanceof Ford)
            return "Ford";
        else
            return "Unknown car name";


    }
}
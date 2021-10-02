package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Bmw;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;



import java.util.ArrayList;
import java.util.List;

import static com.kodilla.collections.arrays.homework.CarUtils.describeCar;

public class CarListAplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Bmw(40));
        Audi audi = new Audi(80);
        cars.add(audi);
        cars.add(new Ford(70));
        cars.add(new Audi(100));


        for (Car car : cars) {
            CarUtils.describeCar(car);
            System.out.println("Aktualna ilość aut w kolekcji to :" + cars.size());

        }
        cars.remove(2);
        cars.remove(audi);

        for (Car car : cars) {
            CarUtils.describeCar(car);
            System.out.println("Aktualna ilość aut w kolekcji to :" + cars.size());
        }

    }

}

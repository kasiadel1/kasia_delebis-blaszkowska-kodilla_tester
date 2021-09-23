package com.kodilla.abstracts.homework.shapes;

import com.kodilla.abstracts.homework.shapes.Rectangle;
import com.kodilla.abstracts.homework.shapes.Square;
import com.kodilla.abstracts.homework.shapes.Triangle;

public class Application {
    public static void main(String[] args) {

        Square square = new Square(4.0);
        System.out.println("square area " + square.calculcateArea());
        System.out.println("square circuit" + square.calculateCircuit());
        Rectangle rectangle = new Rectangle(4.0, 3.0);
        System.out.println("rectangle area " + rectangle.calculateCircuit());
        System.out.println("rectangle circuit " + rectangle.calculcateArea());

        Triangle triangle = new Triangle(10.0, 4.0,5.0,3.0);
        System.out.println("triangle area " + triangle.calculateCircuit());
        System.out.println("triangle circuit " + triangle.calculcateArea());

    }
}

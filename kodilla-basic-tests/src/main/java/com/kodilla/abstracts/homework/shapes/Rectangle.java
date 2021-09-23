package com.kodilla.abstracts.homework.shapes;

public class Rectangle extends Shape {

    private double side1;
    private double side2;

    public Rectangle(double side1, double side2) {
        super();
        this.side1 = side1;
        this.side2 = side2;

    }
    @Override
    public double calculateCircuit() {
double circuit;
circuit = 2* this.side2 + 2* this.side1;
        return circuit;
    }

    @Override
    public double calculcateArea() {
double area;
area = this.side1 * this.side2;
return area;

    }
}

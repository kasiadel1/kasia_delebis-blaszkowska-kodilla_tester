package com.kodilla.abstracts.homework.shapes;

public class Triangle extends Shape {

private double base;
private double sideA;
private double sideB;
private double height;

    public Triangle(double base, double sideA, double sideB, double height) {
        super();
        this.base = base;
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }


    @Override
    public double calculateCircuit() {
double circuit;
circuit = this.base + this.sideA + this.sideB;
        return circuit;
    }

    @Override
    public double calculcateArea() {
double area;
area = this.base * this.height/2;
        return area;
    }
}

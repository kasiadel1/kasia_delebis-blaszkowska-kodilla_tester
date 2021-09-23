package com.kodilla.abstracts.homework.shapes;

public class Square extends Shape {



    private double oneSide;


    public Square(double oneSide) {
        super();
        this.oneSide = oneSide;

    }



    @Override
    public double calculateCircuit() {
        double circuit;
        circuit = this.oneSide * 4;
        return circuit;

    }

    @Override
    public double calculcateArea() {
double area;
area = this.oneSide * this.oneSide;
return  area;
    }
}

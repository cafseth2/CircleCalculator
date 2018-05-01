package com.example.caafs.circlecalculator;

public class Square {
    private double side;

    public double getSide() {
        return side;
    }

    public Square(double side) {
        this.side = side;
    }

    public double getArea() {
        double temp = side * side;
        double value = ((double)((int)(temp *100.0)))/100.0;
        return value;
    }
    public double getPerimeter() {
        double temp = side * 4;
        double value = ((double)((int)(temp *100.0)))/100.0;
        return value;
    }
    public double getVolume() {
        double temp = side * side * side;
        double value = ((double)((int)(temp *100.0)))/100.0;
        return value;
    }
    public double getSurfaceArea() {
        double temp = 6 * side * side;
        double value = ((double)((int)(temp *100.0)))/100.0;
        return value;
    }
}

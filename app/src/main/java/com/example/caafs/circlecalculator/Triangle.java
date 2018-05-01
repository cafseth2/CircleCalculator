package com.example.caafs.circlecalculator;

public class Triangle {
    private double side;

    public double getSide() {
        return side;
    }

    public Triangle(double side) {
        this.side = side;
    }

    public double getArea() {
        double temp = .25 * Math.sqrt(3.0) * side * side;
        double value = ((double)((int)(temp *100.0)))/100.0;
        return value;
    }
    public double getPerimeter() {
        double temp = side * 3;
        double value = ((double)((int)(temp *100.0)))/100.0;
        return value;
    }
    public double getVolume() {
        double temp = (side * side * side) / (6 * Math.sqrt(2.0));
        double value = ((double)((int)(temp *100.0)))/100.0;
        return value;
    }
    public double getSurfaceArea() {
        double temp = Math.sqrt(3.0) * side * side;
        double value = ((double)((int)(temp *100.0)))/100.0;
        return value;
    }
}

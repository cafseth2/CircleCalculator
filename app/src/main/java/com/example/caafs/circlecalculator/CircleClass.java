package com.example.caafs.circlecalculator;

public class CircleClass {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public CircleClass(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        double temp = Math.PI * radius * radius;
        double value = ((double)((int)(temp *100.0)))/100.0;
        return value;
    }

    public double getCircumference() {
        double temp = Math.PI * radius * 2;
        double value = ((double)((int)(temp *100.0)))/100.0;
        return value;
    }

    public double getVolume() {
        double temp = Math.PI * 1.33 * radius * radius * radius;
        double value = ((double)((int)(temp *100.0)))/100.0;
        return value;
    }
    public double getSurfaceArea() {
        double temp = Math.PI * 4.00 * radius * radius;
        double value = ((double)((int)(temp *100.0)))/100.0;
        return value;
    }
}

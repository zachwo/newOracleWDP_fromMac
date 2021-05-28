package com.quiz2;

public class Circle extends Jihe{
    private double radius; // 半径

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    @Override
    public double findArea() {
        return 3.14*Math.pow(radius,2);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

package com.tuf;

abstract class Shape {
    public abstract double calculateArea(double radius);
}

class Circle extends Shape {

    @Override
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

}

class Square extends Shape {

    @Override
    public double calculateArea(double side) {
        return side * side;
    }

}

class AreaCalculator {
    private Shape shape;
    private double dimension;

    public AreaCalculator(Shape shape, double dimension) {
        this.shape = shape;
        this.dimension = dimension;
    }

    public double calculateArea() {
        return shape.calculateArea(dimension);
    }
}

public class OCP {

    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator(new Circle(), 5);

        System.out.println("Area of circle: " + calculator.calculateArea());
    }
}

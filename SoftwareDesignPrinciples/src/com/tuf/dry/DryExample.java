package com.tuf.dry;

class AreaCalculator {
    public static double calculateArea(double length, double width) {
        return length * width;
    }
}

public class DryExample {
    public static void main(String[] args) {
        System.out.println(AreaCalculator.calculateArea(15, 10));
    }
}

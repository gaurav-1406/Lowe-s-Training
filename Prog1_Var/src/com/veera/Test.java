package com.veera ;

public class Test {
    public static void main(String[] args) {
        double principal = 1000;
        double rate = 5;
        double time = 2;
        double simpleInterest = Compute.calculateSimpleInterest(principal, rate, time);
        System.out.println("Simple Interest: " + simpleInterest);

        double length = 5;
        double width = 10;
        double rectangleArea = Compute.calculateRectangleArea(length, width);
        System.out.println("Area of Rectangle: " + rectangleArea);
    }
}

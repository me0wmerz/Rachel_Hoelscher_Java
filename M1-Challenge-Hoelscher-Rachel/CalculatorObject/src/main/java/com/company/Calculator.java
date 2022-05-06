package com.company;

public class Calculator {

    // methods to add/subtract/multiple/divide two integer parameters

    public int add(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a + b));
        return a + b;
    }
    public int subtract(int a, int b) {
        System.out.println(a + " - " + b + " = " + (a - b));
        return a - b;
    }
    public int multiply(int a, int b) {
        System.out.println(a + " * " + b + " = " + (a * b));
        return a * b;
    }
    public int divide(int a, int b) {
        System.out.println(a + " / " + b + " = " + (a / b));
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }

    // methods to add/subtract/multiple/divide two double parameters

    public double add(double a, double b) {
        System.out.println(a + " + " + b + " = " + (a + b));
        return a + b;
    }
    public double subtract(double a, double b) {
        System.out.println(a + " - " + b + " = " + (a - b));
        return a - b;
    }
    public double multiply(double a, double b) {
        System.out.println(a + " * " + b + " = " + (a * b));
        return a * b;
    }
    public double divide(double a, double b) {
        System.out.println(a + " / " + b + " = " + (a / b));
        if (b == 0) {
            System.out.println("Cannot divide by zero");
            return b;
        }
        return a / b;
    }
}
package org.example;

public class Calculator {

    public int add(int a, int b){
        return a + b;
    }

    public int subtract(int a, int b){
        return a - b;

    }

    public int multiply(int a, int b){
        return a * b;
    }

    public int divide(int a, int b) throws DivideByZeroException {
        if (b == 0) {
            throw new DivideByZeroException("Divide by zero");
    } else {
        return a / b;
    }
    }

    public double squareRoot(double a) throws IllegalArgumentException {
        if (a < 0) {
            throw new IllegalArgumentException("Cannot calculate the square root of a negative number");
        }
        return Math.sqrt(a);
    }
}



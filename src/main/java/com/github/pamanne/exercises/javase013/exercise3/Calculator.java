package com.github.pamanne.exercises.javase013.exercise3;

public class Calculator {
    public double add(double a, double b) throws InvalidOperationException {
        double result = a + b;
        if (Double.isInfinite(result)) { // overflow check
            throw new InvalidOperationException("Addition result is too large!");
        }
        return result;
    }

    public double subtract(double a, double b) throws InvalidOperationException {
        double result = a - b;
        if (Double.isInfinite(result)) { // overflow/underflow check
            throw new InvalidOperationException("Subtraction result is too large or too small!");
        }
        return result;
    }

    public double multiply(double a, double b) throws InvalidOperationException {
        double result = a * b;
        if (Double.isInfinite(result)) { // overflow check
            throw new InvalidOperationException("Multiplication result is too large!");
        }
        return result;
    }

    public double divide(double a, double b) throws InvalidOperationException {
        if (b == 0) { // division by zero
            throw new InvalidOperationException("Cannot divide by zero!");
        }
        return a / b;
    }

    
}

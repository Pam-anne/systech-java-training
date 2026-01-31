package com.github.pamanne.exercises.javase013.exercise3;

public class Calculator {

    public static double calculate(double firstNum, double secondNum, String operator) throws InvalidOperationException {

        double result;

        switch (operator) {
            case "+":
                result = firstNum + secondNum;
                break;

            case "-":
                result = firstNum - secondNum;
                break;

            case "*":
                result = firstNum * secondNum;
                break;

            case "/":
                if (secondNum == 0){
                    throw new ArithmeticException("Division by zero is not allowed.");
                }
                result = firstNum / secondNum;
                break;

            default:
                throw new InvalidOperationException("Invalid operator! Use +, -, *, or /.");
        }

        if (Double.isInfinite(result) || Double.isNaN(result))
            throw new ArithmeticException("Result overflow or invalid number.");

        return result;
    }
}

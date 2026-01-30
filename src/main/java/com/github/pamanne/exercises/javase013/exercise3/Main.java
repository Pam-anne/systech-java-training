package com.github.pamanne.exercises.javase013.exercise3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();

        try {
            System.out.print("Enter first number: ");
            double firstNum = scanner.nextDouble(); 
            scanner.nextLine();

            System.out.print("Enter operator (+, -, *, /): ");
            String operator = scanner.nextLine();

            System.out.print("Enter second number: ");
            double secondNum = scanner.nextDouble(); 
            // scanner.nextLine()

            double result = switch (operator) {
                case "+" -> calc.add(firstNum, secondNum);   
                case "-" -> calc.subtract(firstNum, secondNum);                    
                case "*" -> calc.multiply(firstNum, secondNum);                    
                case "/" -> calc.divide(firstNum, secondNum);                  
                default -> throw new InvalidOperationException("Invalid operator: " + operator);
            };

            System.out.println("Result: " + result);

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid number!");
        } catch (InvalidOperationException e) {
            System.out.println("Operation error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Calculator session ended.");
        }
    }
}

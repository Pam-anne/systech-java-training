/**
 * Assessment 3: Mid-Term Practical Test
 * Student: Pamela Akoth Abaki
 * Date: 01-Feb-2026
 * Problem: 4 - Employee Management & Code Debugging
 *
 * Key Features:
 * - Corrects encapsulation violations and static misuse
 * - Proper constructor implementation
 * - Exception handling(InvalidSalaryException,InvalidEmployeeException) and bonus calculation
 * - Add info display method
 */

package com.github.pamanne.asssesments.javase014.Problem4_Pamela_Abaki;

public class TestEmployee {
    public static void main(String[] args) {
        try {
            EmployeeManagement emp1 = new EmployeeManagement("Alice");
            emp1.setSalary(2000);
            emp1.displayEmployeeInfo();

            System.out.println();

        }catch (InvalidEmployeeException e) {
            System.out.println("Error: " + e.getMessage());
        }
         catch (InvalidSalaryException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Test negative salary

        try {
        
            EmployeeManagement emp2 = new EmployeeManagement("Pam");
            emp2.setSalary(-2000); 
        }catch (InvalidEmployeeException e) {
            System.out.println("Error: " + e.getMessage());
        }
         catch (InvalidSalaryException e) {
            System.out.println("Error: " + e.getMessage());
        }

          // Test empty name

        try {
        
            EmployeeManagement emp2 = new EmployeeManagement(" ");
            emp2.setSalary(5000); 
        }catch (InvalidEmployeeException e) {
            System.out.println("Error: " + e.getMessage());
        }
         catch (InvalidSalaryException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

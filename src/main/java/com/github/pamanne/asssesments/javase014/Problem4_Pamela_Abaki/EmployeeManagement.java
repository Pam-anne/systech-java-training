package com.github.pamanne.asssesments.javase014.Problem4_Pamela_Abaki;


public class EmployeeManagement {
    private static String companyName = "COMPANY A";
    private String employeeName;
    private double salary;

    public EmployeeManagement(String name)throws InvalidEmployeeException{
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidEmployeeException("Name can not be empty");
        }

        employeeName = name;
        this.salary = 0.0;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public static String getCompanyName() {
        return companyName;
    }

    public void setSalary(double salary) throws InvalidSalaryException {
        if (salary < 0) {
            throw new InvalidSalaryException("Salary cannot be negative");
        }
        this.salary = salary;
    }

    public double calculateBonus() {
        return salary * 0.1;

    }

    public void displayEmployeeInfo() {
        System.out.println("Company: " + companyName);
        System.out.println("Employee: " + employeeName);
        System.out.println("Salary:$ " + salary);
        System.out.println("Bonus:$ " + calculateBonus());
    }
}
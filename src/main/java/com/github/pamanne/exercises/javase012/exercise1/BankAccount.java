package com.github.pamanne.exercises.javase012.exercise1;

public class BankAccount {
    private static int totalAccounts = 0;
    private static final String bankName = "KCB Bank";
    private static double interestRate = 0.15;

    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        totalAccounts++; 
    }

    // Static Methods
    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public static void setInterestRate(double rate) {
        interestRate = rate;
    }

    public static String getBankName() {
        return bankName;
    }

    // Instance Methods
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(accountHolder + " deposited " + amount + ". New balance:$ " + balance);
        } else {
            System.out.println("Deposit amount must be positive!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(accountHolder + " withdrew " + amount + ". New balance:$ " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    public void applyInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println(accountHolder + " earned interest:$ " + interest + ". New balance:$ " + balance);
    }

}

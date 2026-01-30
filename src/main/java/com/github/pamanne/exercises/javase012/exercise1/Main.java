package com.github.pamanne.exercises.javase012.exercise1;

public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("001", "Pamela", 5000);
        BankAccount acc2 = new BankAccount("002", "Anne", 3000);

        acc1.deposit(1000);
        acc1.withdraw(2000);
        acc1.applyInterest();

        acc2.deposit(200);
        acc2.applyInterest();

        System.out.println("Total Accounts: " + BankAccount.getTotalAccounts());
        System.out.println("Bank Name: " + BankAccount.getBankName());
       


        
    
    }
}

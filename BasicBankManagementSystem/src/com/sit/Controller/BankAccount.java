package com.sit.Controller;

import java.util.Scanner;

public class BankAccount {

    private long accountNumber;
    private String accountHolderName;
    private int pin;
    private double balance;

    // Constructor to initialize account details
    public BankAccount(long accountNumber, String accountHolderName, int pin, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.pin = pin;
        this.balance = balance;
    }

    // Getters
    public long getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public int getPin() {
        return pin;
    }

    // Methods for deposit, withdraw, and display
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Invalid withdraw amount or insufficient balance!");
        }
    }

    public void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    // Static method to add a new account
    public static void addBankAccount(BankAccount[] arr, int index) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Bank Account Number: ");
        long accNo = sc.nextLong();

        // Check for duplicate account number
        for (int i = 0; i < index; i++) {
            if (arr[i] != null && arr[i].getAccountNumber() == accNo) {
                System.out.println("Error: Account number already exists!");
                return;
            }
        }

        sc.nextLine(); // Consume the leftover newline

        System.out.println("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.println("Set a 4-digit PIN: ");
        int pin;
        while (true) {
            pin = sc.nextInt();
            if (String.valueOf(pin).length() == 4) {
                break;
            } else {
                System.out.println("PIN must be 4 digits. Try again:");
            }
        }

        System.out.println("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        arr[index] = new BankAccount(accNo, name, pin, balance);
        System.out.println("Account added successfully!");
    }
}

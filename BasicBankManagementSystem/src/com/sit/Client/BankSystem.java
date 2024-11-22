package com.sit.Client;

import java.util.Scanner;
import com.sit.Controller.BankAccount;

public class BankSystem {
    public static void main(String[] args) {

        int maxAccounts = 10;
        BankAccount[] arr = new BankAccount[maxAccounts];
        int index = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("----------Basic Banking System----------------\n");

        while (true) {
            System.out.println("1. Add New Bank Account \n2. Display Account Details \n3. Deposit Money \n4. Withdraw Money \n5. Exit");
            System.out.println("\nSelect One Option:-");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (index < maxAccounts) {
                        BankAccount.addBankAccount(arr, index);
                        index++;
                    } else {
                        System.out.println("Account storage is full!");
                    }
                    break;

                case 2: // Display Account Details
                    System.out.println("Enter Account Number: ");
                    long accNo = sc.nextLong();

                    System.out.println("Enter 4-digit PIN: ");
                    int pin = sc.nextInt();

                    boolean found = false;
                    for (int i = 0; i < index; i++) {
                        if (arr[i].getAccountNumber() == accNo && arr[i].getPin() == pin) {
                            arr[i].displayAccountDetails();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Invalid Account Number or PIN!");
                    }
                    break;

                case 3: // Deposit Money
                    System.out.println("Enter Account Number: ");
                    long accNoDeposit = sc.nextLong();

                    found = false;
                    for (int i = 0; i < index; i++) {
                        if (arr[i].getAccountNumber() == accNoDeposit) {
                            System.out.println("Enter Deposit Amount: ");
                            double depositAmount = sc.nextDouble();
                            arr[i].deposit(depositAmount);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Account not found!");
                    }
                    break;

                case 4: // Withdraw Money
                    System.out.println("Enter Account Number: ");
                    long accNoWithdraw = sc.nextLong();

                    System.out.println("Enter 4-digit PIN: ");
                    int pinWithdraw = sc.nextInt();

                    found = false;
                    for (int i = 0; i < index; i++) {
                        if (arr[i].getAccountNumber() == accNoWithdraw && arr[i].getPin() == pinWithdraw) {
                            System.out.println("Enter Withdraw Amount: ");
                            double withdrawAmount = sc.nextDouble();
                            arr[i].withdraw(withdrawAmount);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Invalid Account Number or PIN!");
                    }
                    break;

                case 5:
                    System.out.println("Exiting System. Thank you!");
                    System.exit(0);

                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }
    }
}

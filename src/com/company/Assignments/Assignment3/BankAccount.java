package com.company.Assignments.Assignment3;

import java.util.UUID;
//universal unique Identifier
//to generate unique account numbers when defining a BankAccount

public class BankAccount {

    //instance Fields
    private String accountId;
    private double balance;

    //Constructors
    public BankAccount(double startingBalance) {
        this.accountId = UUID.randomUUID().toString(); // Generate unique ID
        balance = startingBalance;
    }

    public BankAccount() {
        this(0.0);
    }

    //Getters
    public String getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }


    //Setters
    public void setBalance(double balance) {
        this.balance = balance;
    }

    //the accountId is generated only once during object creation and
    //cannot be modified afterward. This maintains the integrity and uniqueness of the account IDs.

    public boolean withdraw(double amount) {
        if (amount > 0 || this.balance > amount) {
            this.balance -= amount;
            System.out.println("Withdrawal successful. New balance:" + this.balance);
            return true;
        } else {
            System.out.println("Insufficient funds");
            return false;
        }
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposit successful. New balance:" + this.balance);
            return true;
        } else {
            System.out.println("Invalid deposit amount.");
            return false;
        }
    }

    public void printFormat() {
        System.out.println("Account ID " + this.getAccountId() + " Account Balance " + this.getBalance());
    }


    public static void main(String[] args) {

        BankAccount[] staffAccounts = new BankAccount[2];

        staffAccounts[0] = new BankAccount(550000);
        staffAccounts[1] = new BankAccount(220000);


        //use withdraw and deposit methods
        for (BankAccount account : staffAccounts) {
            account.printFormat();
            account.withdraw(100);
            System.out.println("\n\nAccount after withdraw\n" + account.getBalance());
            account.deposit(200);
            System.out.println("\n\nAccount after deposit\n" + account.getBalance());
        }

    }
}



package com.pluralsight;

public class CreditCard implements Valuable{
    private String name;
    private int accountNumber;
    private double balance;

    public CreditCard(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void charge(int amount){
        balance += amount;
    }

    public void pay(double amount){
        balance -= amount;
    }

    @Override
    public double getValue() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

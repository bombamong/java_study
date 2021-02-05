package com.company;
import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialAmount) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        transactions.add(initialAmount);
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Double> getTransactions() {
        return this.transactions;
    }

    public void addTransaction(double amount) {
        this.transactions.add(amount);
    }

    public double checkBalance() {
        double sum = 0;
        for(Double amount : this.transactions) {
            sum += amount;
        }
        return sum;
    }
}

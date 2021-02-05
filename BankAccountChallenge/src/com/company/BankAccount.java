package com.company;

public class BankAccount {
    private long accountNumber;
    private long balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void deposit(long amount){
        if(amount > 0){
            this.balance += amount;
        } else System.out.println("Invalid amount");
        System.out.println("Current balance is " + this.balance);
    }

    public void withdraw(long amount){
        if(amount > 0){
            this.balance -= amount;
        } else System.out.println("Invalid amount");
        System.out.println("Current balance is " + this.balance);
    }

}

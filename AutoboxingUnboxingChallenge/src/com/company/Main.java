package com.company;

public class Main {

    public static void main(String[] args) {
	    Bank bank = new Bank("National Bank");
	    bank.addBranch("Seoul");
	    bank.addCustomer("Seoul", "David", 250.01);
        bank.addCustomer("Seoul", "Mike", 150050.01);
        bank.addCustomer("Seoul", "John", 10.01);

        bank.addBranch("Jeonju");
        bank.addCustomer("Jeonju", "Bob", 1908231.99);
        bank.addCustomerTransaction("Seoul", "David", 12.47);
        bank.addCustomerTransaction("Seoul", "Mike", 1111.00);
        bank.addCustomerTransaction("Seoul", "John", 165457.47);

        bank.listCustomer("Seoul", true);
        bank.listCustomer("Jeonju", true);



    }
}

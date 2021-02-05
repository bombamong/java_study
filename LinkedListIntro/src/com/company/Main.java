package com.company;

public class Main {

    public static void main(String[] args) {
	    Customer customer = new Customer("Dav", 54.96);
	    Customer anotherCustomer;
	    anotherCustomer = customer;
	    anotherCustomer.setBalance(12.18);
        System.out.println(customer.getBalance());
    }
}

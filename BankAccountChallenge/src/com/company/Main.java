package com.company;

public class Main {

    public static void main(String[] args) {
//        private long accountNumber;
//        private long balance;
//        private String customerName;
//        private String email;
//        private String phoneNumber;
		VipCustomer vip = new VipCustomer();
		System.out.println(vip.getEmail());
		System.out.println(String.format("%.2f", vip.getLimit()));
		System.out.println(vip.getName());
    }
}

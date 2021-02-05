package com.company;

public class VipCustomer {
    private String name;
    private double limit;
    private String email;

    VipCustomer(String name, double limit, String email){
        this.name = name;
        this.limit = limit;
        this.email = email;
    }

    VipCustomer(String name, String email){
        this(name, 0.00, email);
    }

    VipCustomer(){
        this("N/A", 0.00, "N/A");
    }

    public String getName() {
        return name;
    }

    public double getLimit() {
        return limit;
    }

    public String getEmail() {
        return email;
    }

}

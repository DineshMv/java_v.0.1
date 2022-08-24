package com.myJava.OOP1.constructors2;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String emailId;

    public VipCustomer() {
//        this.name = name;
//        this.creditLimit = creditLimit;
//        this.emailId = emailId;

        this("Default Name", 50000, "abc@ijk.com");
    }

    public VipCustomer(String name, double creditLimit) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailId = "Default_emailId";
    }

    public VipCustomer(String name, double creditLimit, String emailId) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailId = emailId;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailId() {
        return emailId;
    }
}

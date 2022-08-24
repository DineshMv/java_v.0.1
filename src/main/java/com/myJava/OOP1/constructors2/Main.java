package com.myJava.OOP1.constructors2;

public class Main {
    public static void main(String[] args) {
        VipCustomer vip1 = new VipCustomer();
        System.out.println("Person Name: " + vip1.getName());

        VipCustomer vip2 = new VipCustomer("Dinesh", 1000.00);
        System.out.println("Name " + vip2.getName() + " Email ID: " + vip2.getEmailId());

        VipCustomer vip3 = new VipCustomer("Dinesh", 1000.00, "abc@ijk.com");
        System.out.println("Name " + vip2.getName() + " and current credit balance is: " + vip2.getCreditLimit() +
                vip3.getEmailId());
    }
}

//O/P1:
//        Person Name: Default Name
//        Name Dinesh Email ID: Default_emailId
//        Name Dinesh and current credit balance is: 1000.0abc@ijk.com
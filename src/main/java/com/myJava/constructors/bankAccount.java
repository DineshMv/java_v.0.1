package com.myJava.constructors;

//Declare object fields
public class bankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    //Create constructor:
    public bankAccount() {
        //If empty constructor is called, we set the default values and call another constructor!
        this("501001001", 5000.25,"Beta","ijk@xyz.com", "000-462-1001");
        System.out.println("Created and called the empty constructor named bankAccount!!");
    }

    public bankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        System.out.println("myAccount constructor is called with parameters!");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // Generate getters and setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of amount: " + depositAmount + " is successful. Current balance is: " + balance);
    }

    public void withdrawal(double withdrawalAmount) {
        if (balance - withdrawalAmount < 0) {
            System.out.println("Available balance is: " + balance + ". Withdrawal request is rejected!");
        } else {
            balance -= withdrawalAmount;
            System.out.println("withdrawal amount of " + withdrawalAmount + " is successful. Remaining balance is: " + balance);
        }
    }

}

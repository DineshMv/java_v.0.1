package com.myJava.OOP1.constructors;

//Purpose of a constructor is to initialise the object created by setting all the initial values to the fields or any other initialization
//bankAccount() => Calls the special method that creates the class / constructor.

public class Main {
    public static void main(String[] args) {
        // bankAccount myAccount = new bankAccount();

        //Calling constructor
        // bankAccount myAccount = new bankAccount("501001010", 2500.75, "Alpha", "abc@fb.com", "00000000-462-1000"); //OP1
        bankAccount myAccount = new bankAccount();  //OP2
        //verify parameters:
        System.out.println(myAccount.getCustomerName());
        System.out.println(myAccount.getAccountNumber());
        System.out.println(myAccount.getBalance());

        //Manually initialising fields
//        myAccount.setAccountNumber("501001010");
//        myAccount.setBalance(2500.75);
//        myAccount.setCustomerName("Alpha");
//        myAccount.setEmail("abc@fb.com");
//        myAccount.setPhoneNumber("000-462-1000");

        myAccount.withdrawal(1000);

        myAccount.deposit(10000);
        myAccount.withdrawal(500.50);

        bankAccount mvAccount = new bankAccount("MV","abc@abc.com", "12345677889");
        System.out.println("Name: "+ mvAccount.getCustomerName() + "Email: " + mvAccount.getEmail() + "Phone Number: " + mvAccount.getPhoneNumber());
    }
}

/*
OP1: when constructor with parameters is called!.....
myAccount constructor is called with parameters!
Alpha
501001010
2500.75
withdrawal amount of 1000.0 is successful. Remaining balance is: 1500.75
Deposit of amount: 10000.0 is successful. Current balance is: 11500.75
withdrawal amount of 500.5 is successful. Remaining balance is: 11000.25
*/


/*
OP2:
myAccount constructor is called with parameters!
Created and called the empty constructor named bankAccount!!
Beta
501001001
5000.25
withdrawal amount of 1000.0 is successful. Remaining balance is: 4000.25
Deposit of amount: 10000.0 is successful. Current balance is: 14000.25
withdrawal amount of 500.5 is successful. Remaining balance is: 13499.75
 */




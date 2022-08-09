package com.myJava.helloworld;

public class strings {
    public static void main(String[] args) {
        //byte, short, int, long, float, double, char, boolean
        String myString = "This a String";
        System.out.println("My first String: " + myString);
        myString = myString + " Adding more";
       // System.out.println(myString);
        myString = myString + " \u00A9 2022";
        System.out.println(myString);

        String numString = "120.34";
        numString = numString + "10.25";
        System.out.println(numString); //String doesn't math operations when num is in " "

        String numeric = "10";
        int myInt = 40;
        numeric = numeric + myInt;
        System.out.println(numeric);

        //should follow StringBuffer

    }
}

package com.myJava.helloworld;

public class dataTypes {
    public static void main(String[] args) {
        //int myValue = 10000;
        int myIntMin = Integer.MIN_VALUE;
        int myIntMax = Integer.MAX_VALUE;
        System.out.println("Int Range: " +myIntMin + " to "+ myIntMax);

        //System.out.println("Busted Max Value: " + (1 + myIntMax)); //Data overflowed!
        //System.out.println("Busted Min Value: " + (-1 + myIntMin)); //Underflow

        byte myMinByte = Byte.MIN_VALUE;
        byte myMaxByte = Byte.MAX_VALUE;
        System.out.println("Byte Range: " + myMinByte + " to " + myMaxByte);

        short myMinShort = Short.MIN_VALUE;
        short myMaxShort = Short.MAX_VALUE;
        System.out.println("Short Range: " + myMinShort + " to " + myMaxShort);

        long myMinLong = Long.MIN_VALUE;
        long myMaxLong = Long.MAX_VALUE;
        System.out.println("Long Range: " + myMinLong + " to " + myMaxLong);

    }
}

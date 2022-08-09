package com.myJava.ExpStatements;

import java.math.*;

public class codingExercise2 {
    public static void main(String[] args) {
        printConversion(10);
        printConversion(-1);
    }

    //Part-1
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        long mph = Math.round(kilometersPerHour / 1.609);
        return mph;
    }

    //Part-2
    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            double milesPerHour = kilometersPerHour * 0.621371;
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}

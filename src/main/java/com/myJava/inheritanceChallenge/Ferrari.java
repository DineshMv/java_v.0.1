package com.myJava.inheritanceChallenge;

public class Ferrari extends Car{
    private int roadServiceMonths;

    public Ferrari(String name, String size, int wheels, int doors, int gears, boolean isManual, int currentGear, int roadServiceMonths) {
        super("Ferrari", "4WD", 4, 4, 5, false, 3);
        this.roadServiceMonths = roadServiceMonths;
    }
}

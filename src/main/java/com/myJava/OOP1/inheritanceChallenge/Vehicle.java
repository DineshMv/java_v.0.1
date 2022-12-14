package com.myJava.OOP1.inheritanceChallenge;

public class Vehicle {
    //    public String handSteering;
//    public int gears;
//    public double speed;
    private String name;
    private String size;
    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.currentDirection = 0;
        this.currentVelocity = 0;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Vehicle.steer() steering at " + currentDirection + " degrees!");
    }

    public void move(int velocity, int direction) {
        currentDirection = direction;
        currentVelocity = velocity;
//        System.out.println("Vehicle.move() moving at a speed of " + currentVelocity + " in direction "+direction);
    }

    public void stop() {
        this.currentVelocity = 0;
    }
}

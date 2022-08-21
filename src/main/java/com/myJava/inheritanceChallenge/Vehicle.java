package com.myJava.inheritanceChallenge;

public class Vehicle {
//    public String handSteering;
//    public int gears;
//    public double speed;
    private String name;
    private String size;

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

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.currentDirection = 0;
        this.currentVelocity = 0;
    }

    public void steer(int direction){
        this.currentDirection += currentDirection;
        System.out.println("Vehicle.steer() steering at "+ currentDirection + " degrees!");
    }

    public void move(int velocity, int direction){
    currentDirection = direction;
    currentVelocity = velocity;
        System.out.println("Vehicle.move() moving at a speed of " + currentVelocity + " in direction "+direction);
    }
    public void stop(int speed){
        this.currentVelocity = 0;
    }
}

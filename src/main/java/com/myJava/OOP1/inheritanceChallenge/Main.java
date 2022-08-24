package com.myJava.OOP1.inheritanceChallenge;

public class Main {
    public static void main(String[] args) {
//        Car ferrari = new Car();
//        ferrari.movingSpeed(150.5);
//        ferrari.gears(5);
//        ferrari.steering("Left");
        Ferrari ferrari = new Ferrari(12);
        ferrari.steer(45);
        ferrari.accelerate(30);
        ferrari.accelerate(20);
        ferrari.accelerate(-40);
    }
}

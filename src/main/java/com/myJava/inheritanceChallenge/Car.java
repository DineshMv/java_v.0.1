package com.myJava.inheritanceChallenge;
public class Car extends Vehicle {
    //    public void movingSpeed(double speed){
//        this.speed = speed;
//        System.out.println("Speed is: "  + speed);
//    }
//
//    public void steering (String steering){
//        this.handSteering = handSteering;
//        System.out.println("Steering is on " + " side of the car");
//    }
//
//    public void gears(int gears){
//        this.gears = gears;
//        System.out.println("Number of gears are: " + gears);
//    }
    private int Wheels;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;

    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual, int currentGear) {
        super(name, size);
        Wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = currentGear;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): changed to " + this.currentGear + " gear.");
    }

    public void changeVelocity(int speed, int direction) {
        System.out.println("Car.changeVelocity(): Velocity " + speed + " direction " + direction);
        move(speed, direction);
    }

    @Override
    public void stop() {
        super.stop();
    }

}

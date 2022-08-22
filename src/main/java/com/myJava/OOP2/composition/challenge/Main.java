package com.myJava.OOP2.composition.challenge;

public class Main {
    public static void main(String[] args) {
        Wall wall1 = new Wall("East");
        Wall wall2 = new Wall("West");
        Wall wall3 = new Wall("North");
        Wall wall4 = new Wall("South");

        Ceiling ceiling = new Ceiling(12, "White");

        Bed bed = new Bed("modern", 4, 3, 2, 1);

        Lamp lamp = new Lamp("classic", false, 75);

        Bedroom bedroom = new Bedroom("myRoom", wall1, wall2, wall3, wall4, ceiling, bed, lamp);

        bedroom.makeBed();
        bedroom.getLamp().turnOn();
    }
}

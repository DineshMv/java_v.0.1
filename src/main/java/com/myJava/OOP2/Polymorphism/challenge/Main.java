package com.myJava.OOP2.Polymorphism.challenge;

class Car {
    private String name;
    private boolean engine;
    private int wheels;
    private int cylinders;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.wheels = 4;
        this.cylinders = cylinders;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine() {
        return "Car -> startEngine()!";
    }

    public String accelerate() {
        return "Car -> accelerate()!";
    }

    public String brake() {
        return "Car -> brake()!";
    }
}

class Ferrari extends Car{
    public Ferrari(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Ferrari -> startEngine()!";
    }

    @Override
    public String accelerate() {
        return "Ferrari -> accelerate()!";
    }

    @Override
    public String brake() {
        return "Ferrari -> brake()!";
    }
}

class Dodge extends Car{
    public Dodge(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Dodge -> startEngine()!";
    }

    @Override
    public String accelerate() {
        return "Dodge -> accelerate()!";
    }

    @Override
    public String brake() {
        return "Dodge -> brake()!";
    }
}

class Audi extends Car{
    public Audi(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine()!";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() +" -> accelerate()!";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() +" -> brake()!";
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car("My New Car", 8);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Ferrari ferrari = new Ferrari("myFerrari",12);
        System.out.println(ferrari.startEngine());
        System.out.println(ferrari.accelerate());
        System.out.println(ferrari.brake());

        Dodge dodge = new Dodge("myDodge",7);
        System.out.println(dodge.startEngine());
        System.out.println(dodge.accelerate());
        System.out.println(dodge.brake());

        Audi audi = new Audi("myAudi",10);
        System.out.println(audi.startEngine());
        System.out.println(audi.accelerate());
        System.out.println(audi.brake());
    }
/* OUTPUT:
Car -> startEngine()!
Car -> accelerate()!
Car -> brake()!
Ferrari -> startEngine()!
Ferrari -> accelerate()!
Ferrari -> brake()!
Dodge -> startEngine()!
Dodge -> accelerate()!
Dodge -> brake()!
Audi -> startEngine()!
Audi -> accelerate()!
Audi -> brake()!
 */
}

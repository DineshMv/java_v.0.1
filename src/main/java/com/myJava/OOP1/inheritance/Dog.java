package com.myJava.OOP1.inheritance;

//If we want to inherit from another class we use extends keyword!
//Need to call the constructor to inherit through extends keyword
public class Dog extends Animal {
    //Class dog has additional characteristics, but it also has basic characteristics that are extended from Animal class
    private final int eyes;
    private final int legs;
    private final int tail;
    private final int teeth;
    private final String coat;

    //Use generate constructor to auto fetch the constructor Animal to Dog class/constructor
    public Dog(String name, int weight, int size, int eyes, int legs, int tail, int teeth, String coat) {

        super("Claire", 1, weight, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() is called!");
        chew();
        super.eat();
//Super means is to call constructor of the class that we are extending from. here super class calls the animal class
    }

    private void chew() {
        System.out.println("Dog.chew() is called!");
    }

    public void walk() {
        System.out.println("Dog.walk() is called!");
        move(5);
    }

    public void run() {
        System.out.println("Dog.run() is called!");
        move(10);
    }


}


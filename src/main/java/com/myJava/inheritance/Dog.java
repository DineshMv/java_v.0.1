package com.myJava.inheritance;

//If we want to inherit from another class we use extends keyword!
//Need to call the constructor to inherit through extends keyword
public class Dog extends Animal {
    //Class dog has additional characteristics, but it also has basic characteristics that are extended from Animal class
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

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

}


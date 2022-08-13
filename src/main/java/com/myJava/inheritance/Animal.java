package com.myJava.inheritance;

public class Animal {
    private int brain;
    private int body;
    private int weight;
    private int size;
    private String name;

    public Animal(String name, int brain, int body, int weight, int size) {
        this.brain = brain;
        this.body = body;
        this.weight = weight;
        this.size = size;
        this.name = name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getWeight() {
        return weight;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public void eat() {
        System.out.println("Animal.eat() method is called!");
    }

    public void move() {
        System.out.println("Animal.move() method is called!");
    }
}

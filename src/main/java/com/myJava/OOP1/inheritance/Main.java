package com.myJava.OOP1.inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("Goldie", 20, 10, 2, 4, 1, 20, "Long Silky");

        //eat and move methods are inherited from Animal class
        dog.eat();
        dog.walk();
        dog.run();
    }
}

//Output:
//Dog.eat() is called!
//Dog.chew() is called!
//Animal.eat() method is called!
//Animal.move() method is called!
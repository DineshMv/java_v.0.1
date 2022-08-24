package com.myJava.OOP1.thisvssuper;
//Super is used to access or call the parent class members (variables and methods)!
//this is used to call current class members(Variables and methods).
// This is required when we have a parameter with same name as instance variable (field).

//this is used with constructors and setters and optionally with getters.
//super is used with method over-riding, when we call a method with same name from a parent class.

//this() is used to call a constructor from another overloaded constructor in same class
//call to this() can only be used in a constructor and must be the first statement in a constructor

//Only way to call a parent constructor is by calling super().
//call to super()must be the first statement in a constructor

//Abstract class is still a super class
//A constructor can have a call to super or either but never both

//Constructor Chaining: Initialising variables of all constructors in the last constructor of instance variables.
//  helps to avoid code duplication

/*public class House {
    private String color;

    public House(String color) {
    //this keyword is required, same parameter is used as a field
        this.color = color;
    }

    public String getColor() {
    //this is optional
        return color;
    }

    public void setColor(String color){
    //this keyword is required, same parameter is used as a field
        this.color = color;
    }

}
*/
class SuperClass{ //parent class or super class
    public void printMethod(){
        System.out.println("Printed in super class");
    }
}

class SubClass extends SuperClass{ //subclass or child class
    //over rides method from parent
    public void printMethod(){
        super.printMethod(); //calls the method in super class
        System.out.println("Printed in sub class");
    }
}
 class Main {
    public static void main(String[] args) {
        SubClass s = new SubClass();
        s.printMethod();
    }
}

//Out-Put:
//Printed in super class
//Printed in sub class


package com.myJava.thisvssuper;
//Example for static and instance variables
public class Dog {
    //private static String name;
    private String name;

    public Dog(String name) {
        //Dog.name = name; valid variable name is static
       this.name = name;    //variable name is instance
    }

    public void printName() {
        System.out.println("Name of the Dog is: " + name);
    }

    public static void main(String[] args) {
        Dog rex = new Dog("Rex");               //Create instance Rex
        Dog fluffy = new Dog("Fluffy");         //Create instance Fluffy
        rex.printName();
        fluffy.printName();

/* When variable name is Static;
Output: Fluffy
Output: Fluffy

Here output of both method calls prints output as Fluffy because Static variables are shared with both instances.
When the static variable 'name' is updated both instances will have same name. so instead, we should use instance variables.
*/

/* When variable name is Static;
Output: Rex
Output: Fluffy

Each instance of the class has its own state or own values for defined variables;
 */

    }
}

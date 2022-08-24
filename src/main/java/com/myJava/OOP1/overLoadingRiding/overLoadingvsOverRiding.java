package com.myJava.OOP1.overLoadingRiding;
/*
Method Overloading:

=> It provides 2 or more separate methods in a class with same name but different parameters
=> Method return type may or may not be different and allows to reuse same method name
=> Reduces duplicate code
=> Overloading is sometimes referred as polymorphism. we can overload static and instance methods
=> Overloading happens in a single class but a method can also be treated as overloaded in subclass of that class
=> Because subclass inherits 1 version of method from parent class and then subclass can have another overloaded version of method

Rules:
1. Methods must have same method name
2. Methods must have different parameters

If it satisfies above, then
1. have different return types
2. have different access modifiers
3. Throw different checked or unchecked exceptions

*/

/*
Method Overriding:
means defining a method in child class that already exists in parent class with same signature (same name, same arguments)
Method Over-riding also known as run-time polymorphism or dynamic method dispatch, because method that is going to be called
is decided at runtime by JVM

when we override a method, it is recommended to insert @override immediately above method definition.
This is the annotation that compiler reads and will show us an error if we don't follow rules of overriding.

Only instance methods can be overridden not static methods

Rules:
1. It must have same name and arguments
2. Return type can be a subclass of the return type in parent class
3. It cannot have a lower access modifier

Note:
1. Only inherited methods can be overridden. Other words, methods can be overridden only in child classes
2. Constructors and private methods cannot be overridden
3. methods that are final cannot be overridden
4. subclass can use super.methodName() to call super class version of an overridden method
 */

public class overLoadingvsOverRiding {
    /* Overloading
        class Dog {
            public void bark() {
                System.out.println("woof!");
            }

            class GermanShepard extends Dog {
                @Override
                public void bark() {
                    System.out.println("woof.. woof...woof!!");
                }
            }
            //methods have same name and parameters

        }
        */
    /* Over-loading
    class Dog {
        public void bark() {
            System.out.println("woof!");
        }
        //same method name but different parameters
        public void bark(int num) {
            for (i = 0; i < num; i++) {
                System.out.println("woof!!");
            }
        }
    }*/
}



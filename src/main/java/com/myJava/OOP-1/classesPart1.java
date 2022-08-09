package OOP_Part1;
/*
* Objects store its state in fields as variables and expose their behavior in methods
* Class is a template or blueprint for an object
* public class main
* public is a access modifier -> Determine what access should be allowed for others to this new class
* Public is unrestricted access to the class -> Other classes can access to this class without any restrictions
* others access modifier - private (No other classes can access the private class), protected
* local variables are accessible only inside a particular code block/method. Can't be accessed outside the method.
* Classes allow us to create variables that can be accessed anywhere within the class -> Class or member variables -> Fields
* When creating a field for class, we need to specify an access modifier same as class
* Defining fields in class, we generally use private
* Encapsulation is used to hide the fields and methods from accessing publicly. Internal representation of an object is hidden from viewing outside object's definintion
* Code creating objects cannot make invalid objects. Encapsulation is that not allowing people access the field directly by forcing.Using methods, we can make sure data in our objects are more valid and are correct
*/
public class classesPart1 {
    public static void main(String[] args) {

        Car porsche = new Car();
        //Created a new datatype or object based on template Car
        Car camry = new Car();
        porsche.setModel("Holden");
        //porsche.setModel("911");
        // porsche.setModel("Dodge");
        System.out.println("Model is: " + porsche.getModel());
    }
}

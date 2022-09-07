package com.myJava.OOP2.MasterChallenge;
/*Bill Burgers -> Manage Process of Selling Hamburgers!
        Select types of burgers, Some addons, Pricing
        Create base hamburger and two other types of hamburgers that are popular
        Basic hamburger have following items that can be added to the burger.
        bread roll type, meat and 4 addons -> Lettuce, tomato, carrot, cheese
        Each item gets charged additional price
        Track how many items got added and calculate the price of base burger after all additions
        Basic burger has a base price and all other additions are all seperately priced
        All above should deal in hamburger class. constructor should only include:
        roll type, meat and price
        2 extra varieties of burgers ( 2 classes) for
        1. Healthy burger:
        on a brown rye bread roll
        +2 items can be added
        total of 6 item
        2. Deluxe burger:
        Chips and drinks as additional items
        No extras are allowed
        All 3 classes should have a method that can be called anytime to show
        base price of burgers
        addition name,
        addition price,
        Grand total for burger
*/
public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        hamburger.addHamburgerAddition1("Cheese", 0.49);
        hamburger.addHamburgerAddition2("Carrot", 0.39);
        hamburger.addHamburgerAddition3("Lettuce", 0.49);
        hamburger.addHamburgerAddition4("Tomato", 0.25);
        //System.out.println("Total burger Price is: " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Chicken", 5.50);
        healthyBurger.addHealthyAddition1("Egg", 0.24);
        healthyBurger.addHealthyAddition2("Lentils", 0.49);
        //System.out.println("Total burger Price is: " + healthyBurger.itemizeHamburger());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addHamburgerAddition1("ABC", 20.09);
        deluxeBurger.addHamburgerAddition1("Should not add",25.00);
        System.out.println("Total burger Price is: " + deluxeBurger.itemizeHamburger());
    }
}

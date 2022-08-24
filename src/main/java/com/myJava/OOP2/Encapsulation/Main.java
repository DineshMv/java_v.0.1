package com.myJava.OOP2.Encapsulation;

//Encapsulation is  the mechanism that allows you to restrict access to certain components of the objects you are creating
//Hide inner working from another class
public class Main {
    public static void main(String[] args) {

//        Player player = new Player();
//        player.health = 50;
//        player.fullName = "FalconFlare";
//        player.weapon = "M4";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining Health: " + player.healthRemaining());
//
//        damage = 41;
//        player.loseHealth(damage);
//        System.out.println("Remaining Health: " + player.healthRemaining());

    EnhancedPlayer player = new EnhancedPlayer("Shelbot",200,"M4");
        System.out.println("Initial Health is: "+ player.getHealth());
    }
}

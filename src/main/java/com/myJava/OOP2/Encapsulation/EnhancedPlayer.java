package com.myJava.OOP2.Encapsulation;

/* Making fields private so that class is not accessible to any class that are outside.
* Protect members of the class from external access. No authorized access to fields directly */
public class EnhancedPlayer {

    private String name;
    private int health=100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if(health >0 && health<=100){
            this.health = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.health = this.health - damage;

        if (this.health <= 0) {
            System.out.println("Player knocked out!");
            //Reduce number of lives
        }
    }

    public int getHealth() {
        return health;
    }
}

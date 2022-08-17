package com.myJava.refInsObjClas;

//We can pass references as parameters to constructors or methods

public class House {
    private String color;

    public House(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

}

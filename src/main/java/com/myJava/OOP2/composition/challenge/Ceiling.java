package com.myJava.OOP2.composition.challenge;

public class Ceiling {
    private int height;
    private String paintedColor;

    public Ceiling(int height, String color) {
        this.height = height;
        this.paintedColor = color;
    }

    public int getHeight() {
        return height;
    }

    public String getPaintedColor() {
        return paintedColor;
    }
}

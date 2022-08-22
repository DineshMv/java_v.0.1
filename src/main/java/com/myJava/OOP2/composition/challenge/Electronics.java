package com.myJava.OOP2.composition.challenge;

public class Electronics {
    private int lamps;
    private int chairs;

    public Electronics(int lamps, int chairs) {
        this.lamps = lamps;
        this.chairs = chairs;
    }

    public int getLamps() {
        return lamps;
    }

    public int getChairs() {
        return chairs;
    }
}

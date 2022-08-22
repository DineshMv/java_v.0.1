package com.myJava.OOP2.composition;

//If we use extends keyword, then we can possibly inherit from only one class as per standard java inheritance. so

public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }
    public void powerUp(){
       // getTheCase().pressPowerButton();
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        //Fancy Graphics
        //getMonitor().drawPixelAt(1200,100,"Blue");
        monitor.drawPixelAt(1200,100,"Blue");
    }
//    private Case getTheCase() {
//        return theCase;
//    }
//
//    private Monitor getMonitor() {
//        return monitor;
//    }
//
//    private Motherboard getMotherboard() {
//        return motherboard;
//    }
}

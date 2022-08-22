package com.myJava.OOP2.composition;

public class Main {
    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(20, 20, 5);

        Case theCase = new Case("220B", "Dell", "240", dimensions);

        //Resolution nativeResolution = new Resolution(1028,968);
        //Monitor monitor = new Monitor("27inch","ACER",27,nativeResolution);

        Monitor theMonitor = new Monitor("27inch", "ACER", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("IN600x", "Intel", 4, 4, "v.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);

//        thePC.getMonitor().drawPixelAt(1500,1200,"Red");
//        thePC.getMotherboard().loadProgram("Windows 11");
//        thePC.getTheCase().pressPowerButton();
        //Now PC has a monitor, has a motherboard, has a case which is why the concept of composition is used here
        thePC.powerUp();

    }

}

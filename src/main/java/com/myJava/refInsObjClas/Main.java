package com.myJava.refInsObjClas;

public class Main {
    public static void main(String[] args) {
        House blueHouse = new House("Blue");            //Creates new instance of house class
        House anotherHouse = blueHouse;                   //Creates a reference for the same object blueHouse

        System.out.println(blueHouse.getColor());           //Blue
        System.out.println(anotherHouse.getColor());        //Red

        anotherHouse.setColor("Red");       //Both references are changed to red now
        System.out.println(blueHouse.getColor());           //Red
        System.out.println(anotherHouse.getColor());        //Red

        House greenHouse = new House("Green");      //New house and setting color to green
        anotherHouse = greenHouse;                      //De-referencing from prev class and assigning to another object

        System.out.println(blueHouse.getColor());           //Red       //Ref
        System.out.println(greenHouse.getColor());          //Blue      //Ref
        System.out.println(anotherHouse.getColor());        //Blue      //Ref

    }
}

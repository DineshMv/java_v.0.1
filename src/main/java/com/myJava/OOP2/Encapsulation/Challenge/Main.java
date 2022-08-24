package com.myJava.OOP2.Encapsulation.Challenge;

public class Main {
    public static void main(String[] args) {

        Printer printer = new Printer(50,true);

        System.out.println("Initial number of pages: " + printer.getNumberOfPages());
        int pagesPrinted = printer.printPages(5);
        System.out.println("Pages printed: "+ pagesPrinted+ ". New total count of printed pages are: "
                + printer.getNumberOfPages());
        pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed: "+ pagesPrinted+ ". New total count of printed pages are: "
                + printer.getNumberOfPages());
    }
}

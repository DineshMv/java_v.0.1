package com.myJava.OOP2.Encapsulation.Challenge;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.pagesPrinted = 0;
        this.isDuplex = isDuplex;
    }

//    public void fillUpToner(int tonerLevel) {
//        if (tonerLevel > 0 && tonerLevel < 100) {
//            this.tonerLevel = tonerLevel;
//        }
//        System.out.println("Toner Level is: " + this.tonerLevel);
//    }
//
//    public void printingPage(int numberOfPages) {
//        if (numberOfPages > 0 && isDuplex == true) {
//            numberOfPages = (numberOfPages / 2);
//            //this.numberOfPages = numberOfPages;
//            System.out.println("Number of pages printed: " + numberOfPages);
//        }
//    }

    public int addToner(int tonerAmount) {
        if (tonerLevel > 0 && tonerLevel <= 100) {
            if (this.tonerLevel + tonerAmount > 100) {
                return -1;
            } else {
                this.tonerLevel += tonerAmount;
                return this.tonerLevel;
            }
        } else {
            return -1;
        }
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if (this.isDuplex) {
            pagesToPrint = (pages/2) + (pages%2);
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getNumberOfPages() {
        return pagesPrinted;
    }
}

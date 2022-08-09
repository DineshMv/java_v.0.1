package com.myJava.helloworld;

public class operator {
    public static void main(String[] args) {
        //Main Concepts: Operands; Expression;
       /* int i = 1+2; //3
        System.out.println(i);
        int prevResult = i;
        //System.out.println(prevResult);
        i = prevResult - 2;
        System.out.println(i);
        i = i*2 + 10; //Product and sum of integers
        System.out.println(i);
        i=i/2;  //Division of numbers
        System.out.println(i);
        i = i%2; //% gives reminder of a division
        System.out.println(i);

        //Abbreviations
        //i = i+1;
        int i=10;
        //i++;
        i+= 5;
        System.out.println("Value of i: " + i);
        int j=10;// j--;
        j*=5;
        System.out.println("Value of j: " + j);

        boolean isAlien = false;
        if(isAlien == true){ //Evaluates the condition
            System.out.println("There are no Aliens!"); //--There are no Aliens!
            System.out.println("I want to see Aliens!");
        }

        int topScore = 75;
        if (topScore <100){
            System.out.println("You got top score!");
        }
        int secondTopScore = 76;
        if((topScore > secondTopScore) && (topScore <100)){
            System.out.println("You got top percentile but less than 100");
        }
        if((topScore > 90) || (topScore <100)){
            System.out.println("You got above 90 percentile but not 100");


        //Difference between = & ==

        int a = 100; //i = 100 is assigning value of 100 to i;
        //i ==100 is evaluating if value of i is 100;
        boolean isCar = true;
        if (isCar ) { //if (isCar== true)
            System.out.println("Type of vehicle is car!");
        }

        //Ternary Operator: operator takes 3 operands |

        boolean isCar = true;
        boolean wasCar = isCar ? true:false;
            System.out.println("Type of vehicle is car!");
        System.out.println(wasCar);*/

        //Challenge:
        double d1 = 20.00d;
        double d2 = 80.00d;
        double result = (d1 + d2)*100; //10000.0
        System.out.println(result);
        double remainder = result % 40.00;
        System.out.println(remainder);

        boolean isNoRemainder = (remainder ==0) ? true : false;
        System.out.println(isNoRemainder);

    }
}

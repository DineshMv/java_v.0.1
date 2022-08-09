package com.myJava.ExpStatements;

//Keywords: Java has 53 reserved keywords;
public class keywordsnExpressions {
    public static void main(String[] args) {
        //1 mile = 1.609344 kms
        double kms = 100*1.609344; //Find number of kms for 100 miles
        System.out.println("Number of kms in 100 miles is: " + kms);
        int highScore =50;
        if(highScore ==50){
            System.out.println("Number of students are: " + highScore);
        }

        //Challenge
        int score = 100;  //Expression: score = 100
        if(score>90){   //Expression: score > 90 ; conditional expression
            System.out.println("You got A grade!"); //Expression: You got A grade!
            score = 0;          //Expression: score = 0;
        }
    }
}

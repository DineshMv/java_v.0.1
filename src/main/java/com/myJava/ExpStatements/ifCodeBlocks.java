package com.myJava.ExpStatements;

public class ifCodeBlocks {
    public static void main(String[] args) {
        //below 4 variables are static variables #Scope is limited to class ifCodeBlocks
        boolean gameOver = true;
        int score = 500;
        int level = 5;
        int bonus = 100;
//        int score2 = 10000;
//        int levelCompleted = 8;
//        int bonus2 = 200;


/*        if (score == 4000)
            System.out.println("Your score was 5000!");
        System.out.println("Your Game is over!");*//*

        if(score<5000 && score > 1000){
            System.out.println("Your Game is over!");
        }else if(score<1000){
            System.out.println("Your are a beginner!");
        }else
            System.out.println("Your score is <5000");*/

        if (gameOver == true) {
            int finalScore = score + (level * bonus);
            //finalScore is instance Variable # scope is limited with in if block
            System.out.println("Your Final score is: " + finalScore);
//            finalScore = 0;
//            finalScore = score2 + (levelCompleted*bonus2);
//            System.out.println("Your Second Final Score is: " + finalScore);
        }
        score = 10000;
        level = 8;
        bonus = 100;
        if (gameOver == true) {
            int finalScore = score + (level * bonus);
            //finalScore is instance Variable # scope is limited with in if block
            System.out.println("Your Final score is: " + finalScore);
        }


    }
}

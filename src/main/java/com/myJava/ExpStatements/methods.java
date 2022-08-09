package com.myJava.ExpStatements;

public class methods {
    public static void main(String[] args) {
//        boolean gameOver = true;
//        int score = 500;
//        int level = 5;
//        int bonus = 100;
        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println(highScore);
        int highScore1 =  calculateScore(false, 10000, 8, 200);
        System.out.println(highScore1);

//        score = 10000;
//        level = 8;
//        bonus = 100;
//        if (gameOver == true) {
//            int finalScore = score + (level * bonus);
//            System.out.println("Your Final score is: " + finalScore);
//        }
    }

    //if I dont want to return anything i should use void.
    //if I want to return data, I should pass appropriate datatype
    //public static void calculateScore(boolean gameOver, int score, int level, int bonus) {
    public static int calculateScore(boolean gameOver, int score, int level, int bonus) {
        if (gameOver) {
            int finalScore = score + (level * bonus);
            finalScore += 1000;
           // System.out.println("Your Final score is: " + finalScore);
            return finalScore;
        }
            return -1;
        // return calculateScore();

    }
}

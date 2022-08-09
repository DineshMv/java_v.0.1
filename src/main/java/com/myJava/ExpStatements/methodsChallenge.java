package com.myJava.ExpStatements;

public class methodsChallenge {

    public static void main(String[] args) {
        int highScore = calculateHighScorePosition(1500);
        displayHighScorePosition("Sheldon", highScore);

        highScore = calculateHighScorePosition(900);
        displayHighScorePosition("Amy", highScore);

        highScore = calculateHighScorePosition(400);
        displayHighScorePosition("Harvey", highScore);

        highScore = calculateHighScorePosition(50);
        displayHighScorePosition("Penny", highScore);

    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
      /*  if (playerScore >= 1000) {
            return 1;
        } //else if (playerScore >= 500 && playerScore < 1000) {
        else if (playerScore >= 500) {
            return 2;
        } //else if (playerScore >= 100 && playerScore < 500) {
        else if (playerScore >= 100) {
            return 3;
        } //else {
        return 4;*/

        int position = 4; //Assuming that returning 4 is default
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }return position;
    }
}

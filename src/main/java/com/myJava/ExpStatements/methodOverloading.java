package com.myJava.ExpStatements;

//Method Overloading allows us to have more than one method with same name but with different number of parameters
//Multiple methods with same name with different implementations
public class methodOverloading {
    public static void main(String[] args) {
        int newScore = calculateScore("Sheldon", 50);
        System.out.println("New Score is: " + newScore);
        calculateScore(100);
        calculateScore();
    }

    //Same method name is created but with different number of parameters
    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + "scored " + score + " points");
        return score * 100;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player " + "scored " + score + " points");
        return score * 100;
    }

    public static int calculateScore() {
        System.out.println("Unnamed player " + "scored " + 0 + " points");
        return 0;
    }

}

package Control_Flow_Statements;

import java.util.Scanner;

//Scanner uses methods like parse internally
public class userInput {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = myScanner.nextLine();

        Scanner myBirthYear = new Scanner(System.in);
        System.out.println("Enter your year of birth: ");
        int birthYear = myBirthYear.nextInt();

        //Calculate age of the person
        int age = 2022 - birthYear;

        System.out.println("Your name is: " + name + " \nyou were born in: " + birthYear + "\nYour age as is: " + age);
        myScanner.close();

    }
//    Input - Output Statements:
//    Enter your name:
//    Sheldon
//    Enter your year of birth:
//    1995

//    Your name is: Sheldon
//    you were born in: 1995
//    Your age as is: 27
}

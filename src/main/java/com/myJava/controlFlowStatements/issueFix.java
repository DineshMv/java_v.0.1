package Control_Flow_Statements;

import java.util.Scanner;

//Scanner uses methods like parse internally
public class issueFix {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = myScanner.nextLine();

        Scanner myBirthYear = new Scanner(System.in);
        System.out.println("Enter your year of birth: ");
        boolean hasNextInt = myBirthYear.hasNextInt();

        if (hasNextInt) {
        int birthYear = myBirthYear.nextInt();

        //boolean hasNextInt = myBirthYear.hasNextInt();

        myScanner.close();
        //Calculate age of the person
        //if (hasNextInt) {
            int age = 2022 - birthYear;
            if (age >= 0 && age <= 100) {
                System.out.println("Your name is: " + name + " \nyou were born in: " + birthYear + "\nYour age as is: " + age);
            } else {
                System.out.println("Invalid year of birth!");
            }
        }else{
            System.out.println("Unable to parse year of birth!");
        }
    }
}
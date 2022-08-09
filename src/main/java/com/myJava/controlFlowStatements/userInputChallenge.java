package Control_Flow_Statements;

import java.util.Scanner;

public class userInputChallenge {
    public static void main(String[] args) {
        int sum = 0;
        int counter;
        Scanner scanner = new Scanner(System.in);
        for (int i = 10; i >= 1; i--) {
            System.out.println("Enter number #" + i + ": ");
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                counter = scanner.nextInt();
                sum += counter;
            } else {
                System.out.println("Invalid number!");
                break;
            }
        }scanner.close();
        System.out.println("Sum of entered 10 numbers is: " + sum);
    }
}


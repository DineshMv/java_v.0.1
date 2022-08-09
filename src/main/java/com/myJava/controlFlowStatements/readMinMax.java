package Control_Flow_Statements;

import java.util.Scanner;

public class readMinMax {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
//        int min = 0;
//        int max = 0;
//        boolean flag = true;
//        Added flag in order to ensure only integers are passed into min and max.
        //Method-2
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while (true) {
            System.out.println("Enter number: ");
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();
//                if(flag){
//                    flag = false;
//                    min = number;
//                    max = number;
//                }

                if (number > max) {
                    max = number;
                } else if (number < min) {
                    min = number;
                }
            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("Minimum value in entered series is: " + min);
        System.out.println("Maximum value in entered series is: " + max);
        scanner.close();
    }
}

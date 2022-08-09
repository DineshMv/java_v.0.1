package Control_Flow_Statements;

public class sumDigitsChallenge {
    public static void main(String[] args) {
        System.out.println("Sum of digits is: " + sumDigits(125));
        System.out.println("Sum of digits is: " + sumDigits(-125));
        System.out.println("Sum of digits is: " + sumDigits(5));

//        Output:
//        Sum of digits is: 8
//        Sum of digits is: -1
//        Sum of digits is: -1
    }

    private static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }
        int sum = 0;
//        125 -> 125/10 -> 12 -> 12*10 + 5 = 125
        while (number > 0) {
            //Get Least Significant Digit
            int digit = number % 10;  //125%10 is 5 ; 12%10 = 2 ; 1%10  = 1
            sum += digit; // 0 + 5 ; 5 + 2 ; 5 + 2 + 1
            //Drop Least Significant Digit
            number /= 10;   //125/10 = 12; 12/10 = 1; 1/10 = 0
        }
        return sum;
    }
}

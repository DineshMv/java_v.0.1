package Control_Flow_Statements;

//For-loop is used when there is a condition to check for certain number of iterations
public class forStatement {
    public static void main(String[] args) {
//        System.out.println("Interest Amount is: " + calculateInterest(10000, 2));
//        System.out.println("Interest Amount is: " + calculateInterest(10000, 2.5));
//        System.out.println("Interest Amount is: " + calculateInterest(10000, 3));
//        System.out.println("Interest Amount is: " + calculateInterest(10000, 4));
//        System.out.println("Interest Amount is: " + calculateInterest(10000, 5));
        for (double i = 2; i <= 8; i++) {
            System.out.println("Interest Amount is: " + String.format("%.2f", calculateInterest(10000, i)));
        }
        int count = 0;
        for (int i = 10; i < 50; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a Prime Number!");

                if(count ==3){
                    System.out.println("Exiting the loop...");
                    break;
                }
            }
        }
    }

    //for(init; termination; increment){ ......... }
    public static double calculateInterest(double amount, double interestRate) {
//          double interestAmount = 0;
//        for (interestRate = 2; interestRate <= 8; interestRate++) {
//            interestAmount = amount * (interestRate / 100);
//            System.out.println("Interest Amount is: " + String.format("%.2f", interestAmount));
//            //   String.format("%.2f", is used here to control the point of precision to 2 decimals!
//        }
//        return 0;

        return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}



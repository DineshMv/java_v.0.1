package Control_Flow_Statements;

public class sum3n5Challenge {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                count++;
                System.out.println("Number " + i + " can be divisible by both 3 and 5");
                sum += i;
            }
            if (count == 5) {
                break;
            }
        }
        System.out.println("Sum of first 5 numbers that are divisible by both 3 and 5 is " + sum);
    }
}

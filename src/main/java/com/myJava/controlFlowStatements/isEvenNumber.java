package Control_Flow_Statements;

public class isEvenNumber {
    public static void main(String[] args) {
        System.out.println(isEven(5));
        isEven(10);

        int firstNumber = 4;
        int lastNumber = 20;
        int count = 0;
        int sum = 0;
        while (firstNumber <= lastNumber) {
            firstNumber++;

            if (!isEven(firstNumber)) {
                continue;
            }
            System.out.println(firstNumber + " is a Even number!");

            count++;
            sum += firstNumber;
            if (count >= 5) {
                System.out.println("sum of even numbers: " + sum);
                break;
            }

        }
    }

    public static boolean isEven(int myValue) {
        if (myValue % 2 == 0) {
            //System.out.println("Entered value " + myValue + " is Even number!");
            return true;
        } else {
            //System.out.println("False");
            return false;
        }
    }
}

package Control_Flow_Statements;

public class switchSt {
    public static void main(String[] args) {
        int myValue = 1;
        if (myValue == 1) {
            System.out.println("Value is 1");
        } else if (myValue == 2) {
            System.out.println("Value is 2");
        } else
            System.out.println("Value is neither 1 nor 2");
        //O/P: Value is 1

        //Implementing Switch Case
        int switchValue = 3;

        switch (switchValue) {
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Value is either 3 or 4 or 5!");
                System.out.println("Entered value is: " + switchValue);
                break;
            default:
                System.out.println("Value is not 1 through 5");
                break;

        }
        //O/P:
        // Value is either 3 or 4 or 5!
        //Entered value is: 3


        String month = "March";
        // Throws error so adding a method .toLowerCase() converts the strings to lower case and checks the conditions
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Month is January!");
                break;
            case "february":
                System.out.println("Month is February!");
                break;
            case "march":
            case "april":
            case "may":
                System.out.println("Month is either March or April or May!");
                System.out.println("Entered Month is: " + month);
                break;
            default:
                System.out.println("Month not found in the given list!");
                break;
        }
        //O/P:
        //Month is either March or April or May!
        //   Entered Month is: March
    }
}

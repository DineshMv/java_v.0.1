package Control_Flow_Statements;

//Parsing value from a string means convert the string into another data type
//Based on specific parse, we can convert a string to various primitive data types
public class parsing {
    public static void main(String[] args) {
        String numAsString = "2022.251";
        //String numAsString = "2022a"; because Java is unable to identify/convert the number format to string
        //Error: Exception in thread "main" java.lang.NumberFormatException: For input string: "2022a"
        //	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
        System.out.println("numAsString= " + numAsString);

       // int number = Integer.parseInt(numAsString);
        double number = Double.parseDouble(numAsString);
        // Integer.parseInt is a Wrapper class Integer.
        //Wrapper class Integer contains some useful static methods like parseInt
        System.out.println("Number= " + number);
        number += 1;
        numAsString += 1;

        System.out.println("numAsString= " + numAsString);  //String
        System.out.println("Number= " + number); //Int
    }
}

package com.myJava.ExpStatements;

public class methodOverloadingChallenge {
    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(5.5, 2);
        calcFeetAndInchesToCentimeters(66);
        calcFeetAndInchesToCentimeters(6, -10);
        calcFeetAndInchesToCentimeters(-5); //return -1; Nothing gets printed in O/P
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inch) {
        double cms = 0;
//        if (feet >= 0 ? inch >= 0 && inch <= 10 : false) {
//            cms = 30.48 * feet + 2.54 * inch;
//            System.out.println(feet + "Feet and " + inch + " inches = " + cms + " cms");
//        } else
//            return -1;
//        return cms;
        if ((feet < 0) || ((inch < 0) || (inch > 12))) {
            System.out.println("Invalid feet or Inch parameters!");
            return -1;
        }
        cms += (feet * 12) * 2.54;
        cms += inch * 2.54;
        System.out.println(feet + "Feet and " + inch + " inches = " + cms + " cms");
        return cms;
    }

    public static double calcFeetAndInchesToCentimeters(double inch) {
        double feet = 0;
        if (inch < 0) {
            return -1;
        }
        feet = 0.0833333 * inch;
        System.out.println(inch + " inches is " + feet + " feet");
        return feet;
    }
}

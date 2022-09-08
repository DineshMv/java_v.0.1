package com.myJava.ArraysLists.Arrays;

//Variables or Strings hold a single value
//Array is a data Structure that enables to store a sequence of values of same type - Int, char, strings


import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        // int myValue = 50;
//        int[] myIntArray = new int[10]; //Assigned 10 integer elements to the array
//        myIntArray[5] = 10; //Storing value 10 in 6th element
//
//        double[] myDoubleArray = new double[10];
//        myDoubleArray[2] = 2.14;
//
//        System.out.println("myIntArray is: " + myIntArray[5] + " and myDoubleArray is: " + myDoubleArray[2]);
//
//        //To declare all elements in the array
//        myIntArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        System.out.println(myIntArray[5]);
//
//        //Other way of initializing array
//        for (int i = 0; i < myIntArray.length; i++) {
//            myIntArray[i] = i * 2;
//           // System.out.println("Element " + i + ", value is " + myIntArray[i]);
//        } printArray(myIntArray);
//    }
//    public static void printArray(int[] array){
//        for (int i = 0; i < array.length; i++) {
//            System.out.println("Element " + i + ", value is " + array[i]);
//        }
//    }
        int[] myIntegers = getIntegers(5);
        for(int i=0;i<myIntegers.length;i++){
            System.out.println("Element " + i + ", typed value was: "+ myIntegers[i]);
        }
        System.out.println("Average of elements in the array is: "+getAverage(myIntegers));

    }

    private static int[] getIntegers(int number) {
        System.out.println("Enter "+ number + " integer values. \r");
        int[] values = new int[number];

        for(int i=0;i<values.length;i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array){
        int sum=0;
        for(int i=0;i< array.length;i++){
            sum+=array[i];
        }
        return (double) sum / (double) array.length;
    }


}

package com.myJava.ArraysLists.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysChallenge {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntArray = getIntegers(5);
        int[] sorted = sortIntegers(myIntArray);

        printArray(sorted);
    }
    private static int[] getIntegers(int number) {
        System.out.println("Enter "+ number + " integer values. \r");
        int[] myArray = new int[number];
        for(int i=0;i<myArray.length;i++){
            myArray[i] = scanner.nextInt();
        }
        return myArray;
    }

    private static void printArray(int[] myArray){
        for(int i=0;i<myArray.length;i++) {
            System.out.println("Element " + i + " value was: " + myArray[i]);
        }
    }

    private static int[] sortIntegers(int[] array){
//        int[] sortedArray = new int[array.length];
//        for(int i=0;i<array.length;i++){
//            sortedArray[i] = array[i]; //Copy of arrays
//        }

        int[] sortedArray = Arrays.copyOf(array,array.length);

        boolean flag = true;
        int temp;

        while(flag){
            flag = false;
            for(int i=0;i<sortedArray.length-1;i++){
                if(sortedArray[i]<sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}

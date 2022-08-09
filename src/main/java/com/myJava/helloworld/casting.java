package com.myJava.helloworld;
//Casting means to treat or convert a number from one type to others.

public class casting {
    public static void main(String[] args) {
        int x = -2147483648;
        byte b = -128;
        short s = -32768;

        int x2 = x/2;
        byte b2 = (byte) (b/2);
        short s2 = (short) (s/2);
        System.out.println(b2 + "," + x2 + "," + s2);
    }
}

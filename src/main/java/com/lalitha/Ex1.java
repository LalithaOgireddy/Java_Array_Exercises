package com.lalitha;

/* Write a program which will store elements in an array of type ‘int’ and print it out.
Expected output: 11 23 39 etc. */
public class Ex1 {
    public static void main(String[] args) {
        int[] intArr = new int[]{11, 23, 39, 45, 35};
        for (int i : intArr) {
            System.out.println(i);
        }
    }
}


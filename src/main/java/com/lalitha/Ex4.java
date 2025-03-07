package com.lalitha;

/* Write a program which will copy the elements of one array into another array.
Expected output: Elements from first array: 1 15 20
Elements from second array: 1 15 20 */

import java.util.Arrays;

public class Ex4 {
    public static void main(String[] args) {
        int[] arr1 = {1,15,20};
        int[] arr2 = Arrays.copyOf(arr1,3);

        System.out.println("Elements from first array: "+Arrays.toString(arr1));
        System.out.println("Elements from second array: "+Arrays.toString(arr2));
    }
}

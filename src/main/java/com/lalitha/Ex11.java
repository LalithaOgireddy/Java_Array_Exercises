package com.lalitha;
/*1.Write a program that ask the user for an integer and repeat that
question until user give you a specific value that user already has been
told about as a message in your program. Store these values in an array
and print that array. After that reverse the array elements so that the
first element becomes the last element, the second element becomes
the second to last element, etc. Do not just reverse the order in which
they are printed. You need to change the way they are stored in the
array. */

import java.util.Arrays;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the number which is the squareroot of square of first prime number :");
        int inputNum = sc.nextInt();
        int[] intArr = {inputNum};
        while(inputNum != 7) {
            System.out.println("Enter again:");
            inputNum = sc.nextInt();
            intArr = addElementToArray(inputNum,intArr);
        }
        int[] revArr = reverseArray(intArr);
        System.out.println("Array: "+Arrays.toString(intArr));
        System.out.println("Array: "+Arrays.toString(revArr));
    }

    public static int[] addElementToArray(int element,int[] arr){
        int[] intArr = Arrays.copyOf(arr,arr.length+1);
        intArr[arr.length] = element;
        return intArr;
    }

    public static int[] reverseArray(int[] arr){
        int[] intArr = new int[arr.length];
        int index = arr.length-1;
        for(int i=0;i<arr.length;i++){
            intArr[index-i] = arr[i];
        }
        return intArr;
    }
}

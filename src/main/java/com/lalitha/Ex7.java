package com.lalitha;

import java.util.Arrays;

/* Write a program which will set up an array to hold 10 numbers and print
out only the uneven numbers.
Expected output: Array: 1 2 4 7 9 12
Odd Array: 1 7 9 */
public class Ex7 {
    public static void main(String[] args) {
        int[] intArr = {1,2,4,7,9,12};
        //check how many numbers are odd
        int j=0;
        for(int i : intArr){
            if(i%2!=0){
                j++;
            }
        }
        //insert all odd integers into oddArr
        int x=0;
        int[] oddArr = new int[j];
        for(int i : intArr){
            if(i%2!=0){
                oddArr[x]=i;
                x++;
            }
        }
        //Print output
        System.out.println("Array :"+ Arrays.toString(intArr));
        System.out.println("Odd Array :"+Arrays.toString(oddArr));
    }
}

package com.lalitha;

import java.util.Arrays;

/*Write a method which will add elements in an array.
Remember that arrays are fixed in size so you need to come up with a
solution to “expand” the array.*/
public class Ex9 {
    public static void main(String[] args) {
        int[] array = {1,2,3};
        array = addElementToArray(4,array);
        array = addElementToArray(5,array);
        array = addElementToArray(6,array);
        System.out.println("Array: "+Arrays.toString(array));
    }
    public static int[] addElementToArray(int element,int[] arr){
        int[] intArr = Arrays.copyOf(arr,arr.length+1);
        intArr[arr.length] = element;
        return intArr;
    }
}

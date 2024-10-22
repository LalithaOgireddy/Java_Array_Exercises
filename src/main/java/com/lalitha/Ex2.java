package com.lalitha;

/*Create a program and create a method with name ‘indexOf’ which will
find and return the index of an element in the array. If the element
doesn’t exist your method should return -1 as value.
Expected output: Index position of number 5 is: 2.*/

public class Ex2 {
    public static void main(String[] args) {
        int[] array1 = {1,5,4,2,6,7};
        int element = 5;
        int index = indexOf(element,array1);
        System.out.println("Index position of number "+element+" is: "+index);
    }

    public static int indexOf(int element,int[] inArr) {
        int index = -1;
        for(int i=0;i<inArr.length;i++) {
            if(inArr[i] == element){
                index = i;
            }
        }
        return index;
    }
}

package com.lalitha;

import java.util.Arrays;

/*Write a program which will remove the duplicate elements of a given
array [{20, 20, 40, 20, 30, 40, 50, 60, 50}].
Expected output: Array: 20 20 40 20 30 40 50 60 50
 Array without duplicate values: 20 40 30 50 60*/
public class Ex8 {
    public static void main(String[] args) {
        int[] intArr = {20, 20, 40, 20, 30, 40, 50, 60, 50};
        int[] noDupArr = {20};
        boolean isNotPresent = false;
        for(int i=0;i<intArr.length;i++){
            for(int j=0;j<noDupArr.length;j++){
                isNotPresent = false;
                if(intArr[i]!= noDupArr[j]){
                    isNotPresent = true;
                } else break;
            }
            if(isNotPresent){
                noDupArr = addElementToArray(intArr[i],noDupArr);
            }

        }
        System.out.println("Array: "+Arrays.toString(intArr));
        System.out.println("Array without duplicate values: "+Arrays.toString(noDupArr));
    }

    public static int[] addElementToArray(int element,int[] arr){
        int[] array = Arrays.copyOf(arr,arr.length+1);
        array[arr.length] = element;
        return array;
    }
}

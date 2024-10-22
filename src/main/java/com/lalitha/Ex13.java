package com.lalitha;

import java.util.Arrays;
import java.util.Random;

public class Ex13 {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        Random random=new Random();
        for(int i=0;i<arr1.length;i++){
            arr1[i]=random.nextInt(1,50);

        }
        int odd = 0;
        int even = arr1.length-1;
        for(int i : arr1){
            if(i%2==0){
                arr2[even]=i;
                even--;

            }else{
                arr2[odd]=i;
                odd++;
            }
        }
        System.out.println("Array::"+ Arrays.toString(arr1));
        System.out.println("OddEvenArray:"+Arrays.toString(arr2));
    }
}

package com.lalitha;

import java.util.Arrays;

/*Write a program which will sort string array.
Expected output: String array: [Paris, London, New York, Stockholm]
 Sort string array: [London, New York, Paris, Stockholm] */
public class Ex3 {
    public static void main(String[] args) {
        String[] strArr = {"Paris", "London", "New York", "Stockholm"};
        Arrays.sort(strArr);
        for(String str : strArr){
            System.out.println(str);
        }
    }
}

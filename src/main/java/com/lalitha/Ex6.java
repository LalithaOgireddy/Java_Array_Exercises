package com.lalitha;
/*Write a program which will set up an array to hold the next values in this
order: 43, 5, 23, 17, 2, 14 and print the average of these 6 numbers.
Expected output: Average is: 17.3 */
public class Ex6 {
    public static void main(String[] args) {
        int[] intArr = {43, 5, 23, 17, 2, 14};
        int sum = 0;
        for(int i : intArr){
            sum+=i;
        }
        int length = intArr.length;
        double avg = (double)sum/length;
        System.out.printf("Average is: %.1f",avg);
    }
}

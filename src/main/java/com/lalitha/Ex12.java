package com.lalitha;

/*Write a program which will print the diagonal elements of two dimensional array. */
public class Ex12 {
    public static void main(String[] args) {
        int[][] intArr = new int[3][3];
        intArr[0][0] = 1;
        intArr[0][1] = 2;
        intArr[0][2] = 3;
        intArr[1][0] = 2;
        intArr[1][1] = 4;
        intArr[1][2] = 6;
        intArr[2][0] = 3;
        intArr[2][1] = 6;
        intArr[2][2] = 9;
        for(int i=0;i<=2;i++){
            System.out.printf("%d ",intArr[i][i]);
        }
    }
}

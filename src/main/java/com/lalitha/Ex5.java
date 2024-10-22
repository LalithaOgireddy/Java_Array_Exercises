package com.lalitha;

/*Create a two-dimensional string array [2][2]. Assign values to the
2-dimensional array containing any Country and City.
Expected output: France Paris
Sweden Stockholm */

public class Ex5 {
    public static void main(String[] args) {
        String[][] str = new String[2][2];
        str[0][0] = "France";
        str[0][1] = "Paris";
        str[1][0] = "Sweden";
        str[1][1] = "Stockholm";
        System.out.println(str[0][0] +" "+str[0][1]);
        System.out.println(str[1][0] +" "+str[1][1]);
    }
}

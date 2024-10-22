package com.lalitha;
/*Write a program which will represent multiplication table stored in
multidimensional array.
Hint: You have two-dimensional array with values
[[1,2,3,4,5,6,7,8,9,10], [1,2,3,4,5,6,7,8,9,10]] */
public class Ex10 {
    public static void main(String[] args) {
        int[] op1={1,2,3,4,5,6,7,8,9,10};
        int[] op2={1,2,3,4,5,6,7,8,9,10};
        int[][] mul= new int[10][10];
        int i;
        int j;
        for(i=0;i<op1.length;i++){
            for(j=0;j<op2.length;j++){
                System.out.println("inside j loop");
                if(i==0){
                    mul[i][j] = op2[j];
                } else if (j==0){
                    mul[i][j] = op1[i];
                } else mul[i][j] = op1[i]*op2[j];
            }
        }
        String str;
        for(i=0;i<op1.length;i++){
            str="";
            for(j=0;j<op2.length;j++){
                str = str + mul[i][j] + "   ";
            }
            System.out.println(str);
        }
    }
}

package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MultiDimentinalArray {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
//        int[][] arr = new int[3][3];

//        int[][]  arr =  {
//                 {12,5,3},//0th index
//                 {12,5}, // 1at index
//                 {23,9,8} // 2nd index
//        };


        int [][] arr =new int[3][3];

        // To gate a input of 2D Array

        for (int col = 0; col <arr.length; col++) {
            for (int row = 0; row <arr[col].length; row++) {
                arr[col][row] = in.nextInt();
            }
        }

        // To Print
//
//        for (int col = 0; col < arr.length ; col++) {
//            System.out.println(Arrays.toString(arr[col]));
//        }
//
        // For Each by enhance for LOop

        for(int[] a :arr){
            System.out.println(Arrays.toString(a));
        }

    }
}

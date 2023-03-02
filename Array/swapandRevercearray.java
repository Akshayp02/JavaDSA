package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class swapandRevercearray {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
         int[] arr =new int[5];

        System.out.println("Enter array Element");
        for (int i = 0; i < arr.length ; i++) {
         arr[i] = in.nextInt();
        }
//        for (int num: arr) {
//            System.out.println(num + "");
//        }
//        System.out.println(arr[2]);

        System.out.println(Arrays.toString(arr));
    }
}

package com.company;

import java.util.Scanner;

public class ArrayusingFOR {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int i = ip.nextInt();
        int[] arr = new int[i];

        System.out.println("Enter the Element");
        for(int j = 0;j<arr.length;j++){
            int m = ip.nextInt();
            arr[j] = m;
        }

//        for(int j = 0;j<arr.length;j++){
//            System.out.print(arr[j]);
//        }

        for(int num : arr){
            System.out.println(num + " ");
        }

    }
}

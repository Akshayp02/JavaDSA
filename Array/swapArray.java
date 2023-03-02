package com.company;

import java.util.Arrays;

public class swapArray {
    public static void main(String[] args) {

        // Swap the Array element using index

        int[] arr = {1,22,32,3,18 };
        System.out.println(Arrays.toString(arr));
        swap(arr,1,3);

        System.out.println(Arrays.toString(arr));

    }
    static void swap(int[] a,int index1 ,int index2){
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }
}

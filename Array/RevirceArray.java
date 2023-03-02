package com.company;

import java.util.Arrays;

public class RevirceArray {
    public static void main(String[] args) {
        // Reverse the Array
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        ReverseArray(arr);
        System.out.println(Arrays.toString(arr));


    }

    public static void ReverseArray(int[] a){
        int start = 0;
        int end = a.length-1;

        while(start<end){
            swap(a,start,end);
            start++;
            end--;
        }
    }
    public static void swap(int[] a,int A, int b)
    {
        int temp = a[A];
        a[A] = a[b];
        a[b] = temp;

    }

}

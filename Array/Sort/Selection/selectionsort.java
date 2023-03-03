package com.company;

import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int[] nums = {-1,8,-3,-8};
        selection(nums);
        System.out.println(Arrays.toString(nums));

    }

    // function to perform selection sort
    public static void selection(int[] arr) {
        //select the max number and swap it with its correct index.
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-i-1;
            int maxIndex = getmaxelement(arr, 0, last);
            swap(arr, maxIndex, last);

        }

    }

    // function to get max element in the array
    public static int getmaxelement(int[] arr, int start, int last) {
        int max = start;
        for (int i = start; i <= last; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    //function to perform the swapping
    public static void swap(int[] arr, int First_ELE, int second_ELE) {
        int temp = arr[First_ELE];
        arr[First_ELE] = arr[second_ELE];
        arr[second_ELE] = temp;
    }
}

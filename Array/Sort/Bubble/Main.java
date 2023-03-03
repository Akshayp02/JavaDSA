package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // simple bubble sort applied here
        // 912. Sort an Array Leet code 
        int[] arr = {5,1,1,2,0,0};
        sortArray(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void sortArray(int[] nums) {

        boolean isSwaped;
        for (int i = 0; i < nums.length ; i++) {
            isSwaped = false;
            for (int j = 1; j < nums.length-i; j++) {
                if (nums[j] < nums[j-1]) {
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                    isSwaped = true;
                }

            }
            if(!isSwaped){
                break;
            }
        }

    }
}


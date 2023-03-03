package com.company;

import java.util.Arrays;

public class insertionSort {
    //********** insertion sort *******
    // why insertion sort?
    // Number of Swap are reduced as compare to bubble sort
    // stable
    //time complexity O(n^2)

    //*************** Test Cases *****************
    // 1: [5, 4, 3, 1, 2]
    // 2: []
    // 3: [ 7, 3, -6, -2]
    // 4: [ 56, 97, 34, 65]
    // 5: [-1, 0]



    public static void main(String[] args) {

        int[] arr = {7, 3, -6, -2};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j =i+1; j > 0; j--) {
                if (nums[j] < nums[j - 1]) {
                    Swap(nums, j, j - 1);
                }else{
                    break;
                }
            }

        }
    }

    static void Swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

package com.company;

public class ordderdignastic {
    public static void main(String[] args) {
       // int[] arr = {2,4,6,7,8,12,16,18};
        int[] arr = {18,16,14,12,10,8,5,2};
        int target = 10;
        System.out.println(BinarySearchOrder(arr,target));
    }

    public static int BinarySearchOrder(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        // Check is the arr asending or desending Order

        boolean isAss = arr[start]<arr[end];

        while(start<=end){


            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }
            if(isAss){

                if(target < arr[mid]){
                    end = mid -1;
                }else if(target > arr[mid]) {
                    start = mid + 1;
                }

            }else{

                if(target > arr[mid]){
                    end = mid -1;
                }else if(target < arr[mid]){
                    start = mid + 1;
                }
            }

        }

        return -1;
    }
}

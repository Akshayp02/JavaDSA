package com.company;

public class floorNum {
    public static void main(String[] args) {

        // floor means the greter element of array which grater then = target
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
        System.out.println(CeilingNUM(arr,target));
    }

    public static int CeilingNUM(int[] arr, int target) {
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

        return end;
    }
}

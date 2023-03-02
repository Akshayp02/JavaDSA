package com.company;

public class Main {

    public static void main(String[] args) {
	//Binary search for Assending order
        int[] arr = {2,4,6,7,8,12,16,18};
       // int[] arr = {18,16,14,12,10,8,5,2};
        int target = 5;
        System.out.println(BinarySearch(arr,target));
    }

    public static int BinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        // return the index of target Number

        while(start<=end){ // for desending change " > ".

            // the mid element become

            int mid = start + (end - start)/2;

            if(target<arr[mid]){
                end = mid -1;
            }else if(target>arr[mid]){
                start = mid + 1;
            }else{

                return mid;
            }

        }

        return -1;
    }
}

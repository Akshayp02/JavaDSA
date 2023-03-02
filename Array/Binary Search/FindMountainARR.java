package com.company;
//Find in Mountain Array
public class FindMountainARR {
    public static void main(String[] args) {
    int[] arr ={1,2,3,4,5,3,1};
    int target = 3;
        System.out.println(Search(arr,target));
    }
    public static int Search(int[] arr,int target){
        int peak = peakIndexInMountainArray(arr);
        int firstly = BinarySearchOrder(arr,target,0,peak);
        if(firstly!=0){
            return firstly;
        }
        return BinarySearchOrder(arr,target,peak +1,arr.length-1);

    }
    public static int peakIndexInMountainArray(int[] arr) {
        int start =0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end - start)/2;

            if(arr[mid] > arr[mid+1] ){
                end = mid ;

            }else{
                start = mid+1;
            }
        }
        return start;
    }

    public static int BinarySearchOrder(int[] arr, int target, int start,int end) {

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

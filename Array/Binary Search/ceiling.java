package com.company;

public class ceiling {
    public static void main(String[] args) {
        // ceiling means the smallest element of array which grater then target
        int[] arr = {1};
        int target = 1;
        System.out.println(CeilingNUM(arr,target));
    }

    public static int CeilingNUM(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        // Check is the arr asending or desending Order

        boolean isAss = nums[start]<nums[end];

        while(start<=end){


            int mid = start + (end - start)/2;

            //if(nums[mid] == target){
              //  return mid;
          //  }
            if(isAss){

                if(target < nums[mid]){
                    end = mid -1;
                }else if(target > nums[mid]) {
                    start = mid + 1;
                }

            }else{

                if(target > nums[mid]){
                    end = mid -1;
                }else if(target < nums[mid]){
                    start = mid + 1;
                }
            }

        }

        return start;
    }
}

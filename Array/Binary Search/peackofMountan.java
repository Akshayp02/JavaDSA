package com.company;

public class peackofMountan {
    public static void main(String args[]){
        int[] arr = {1, 2, 3, 1};

        //System.out.println(findPeakElement(arr));

    }
    public int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length-1;

        // Check is the arr asending or desending Order

        boolean isAss =nums[start]<=nums[end];

        while(start<=end){


            int mid = start + (end - start)/2;

            if(nums[mid] == nums[mid + 1]){
                return mid;
            }
            if(isAss){

                if(nums[mid + 1] < nums[mid]){
                    end = mid -1;
                }else if(nums[mid + 1] > nums[mid]) {
                    start = mid + 1;
                }

            }else{

                if(nums[mid + 1] > nums[mid]){
                    end = mid -1;
                }else if(nums[mid + 1] < nums[mid]){
                    start = mid + 1;
                }
            }

        }
        return start;
    }
}

package com.company;

public class FBstartandEndofele {
    public static void main(String[] args) {

    }
    public int[] searchRange(int[] nums, int target) {
        int[] ans ={ -1,-1};

        int start = search(nums,target,true);
        int end = search(nums,target,false);

        ans[0] = start;
        ans[1] = end ;

        return ans;
    }
    public static int search(int[] nums, int target,boolean isStarting){
        int ans =-1;

        // check simple Binary Search on Array
         int start = 0;
         int end = nums.length-1;

         while(start <= end)
         {
             int mid = start + (end - start)/2;

             if(target <= nums[mid])
             {
                 end =mid - 1;
             }else if(target >= nums[mid])
             {
                 start =mid +1;
             }else{
                 // return the Potential ans
                 start = mid;
                 if(isStarting)
                 {
                     end = mid-1;
                 }else {
                     start = mid + 1;
                 }
             }

         }

        return ans;

    }
}

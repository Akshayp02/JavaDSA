package com.company;

public class SearchINRange {
    public static void main(String[] args) {
        ///*************** Search the 3 in range index[ 1 to 4 ] ********** ///

        int [] arr ={18,12,-7,3,14,28};

        System.out.println(isElementExist(arr,-1,1,4));

    }

    public static int isElementExist(int[] arr,int target, int StartingIndex, int EndIndex) {
        if(arr.length == 0){
            return Integer.MAX_VALUE;
        }
        for (int i = StartingIndex; i < EndIndex ; i++) {
            int num =arr[i];
            if(num == target){
                return i;
            }

        }
        return Integer.MAX_VALUE;
    }
}

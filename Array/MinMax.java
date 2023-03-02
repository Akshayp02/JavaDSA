package com.company;

public class MinMax {
    public static void main(String[] args) {


        /// ***************** Find the minimum and Maximum NUmber int the array *****************  ///

        int [] arr ={18,12,7,3,14,8828};
        System.out.println(min(arr));
        System.out.println(Max(arr));


    }

    public static int min(int[] arr) {
        // Assume Array != 0
        int ans = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] < ans){
                ans = arr[i];
            }

        }
        return ans;
    }

    public static int Max(int[] arr){
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>ans){
                ans = arr[i];
            }

        }
        return ans;
    }
}

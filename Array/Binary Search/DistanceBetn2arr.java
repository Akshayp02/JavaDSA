package com.company;

public class DistanceBetn2arr {
    public static void main(String[] args) {
        int[] arr1 = {4,5,8};
        int[] arr2 = {10,9,1,8};
        int d = 2;

        int temp = 0;

        System.out.println(findTheDistanceValue(arr1,arr2,2));

    }
    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int temp = 0;

        for (int i = 0; i < arr1.length-1; i++) {

            for (int j = 0; j < arr2.length-1; j++) {

                if(arr1[i]-arr2[j]<=d){
                    temp += 1;
                }

            }

        }
        return temp;
    }

}

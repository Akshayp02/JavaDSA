package com.company;

public class Seartchin2Darr {
    public static void main(String[] args) {
        /// *****
        int[][] arr = {
                { 1,22,42,43},
                { 33,2,11},
                { 2,23,78,3},
                { 12,54},
        };
        System.out.println(Search(arr,233));
    }

    static boolean Search(int[][] arr, int target) {
        for (int row = 0; row <arr.length ; row++) {

            for (int col = 0; col <arr[row].length; col++) {
                if(arr[row][col] == target){
                    return true;
                }

            }

        }
        return false;
    }
}

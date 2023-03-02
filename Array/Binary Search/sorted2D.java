package com.company;

import java.util.Arrays;

public class sorted2D {
    public static void main(String[] args) {
        // Search in sorted array

        // solution will be like
        // case 1 : if Element == target then

        int[][] matrix = {
                {10,20,30,40},
                {15,25,35,45},
                {28,27,37,49},
                {33,34,38,50},
        };

        int target = 33;

        System.out.println(Arrays.toString(Search(matrix,33)));

    }

    public static int[] Search(int[][] arr,int target){
        int rows = 0;
        int cols = arr.length-1;

        while(rows< arr.length && cols >=0){
            if (arr[rows][cols] == target)
            {
                return new int[]{rows,cols};
            }
            if(arr[rows][cols] < target)
            {
                rows++;
            }
            else{
                cols--;
            }
        }

        return new int[]{-1,-1};
    }
}

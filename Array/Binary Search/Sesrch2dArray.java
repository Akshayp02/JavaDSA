package com.company;

public class Sesrch2dArray {
    public static void main(String arg[]) {

        int[][] arr = {{10, 30, 12, 40},
                       {22, 42, 13, 54},
                       {37, 23, 22, 55},
        };

        int target = 13;
        System.out.println(Search(arr,target));


    }

    // Simple search in the 2d Array

    public static int[] Search(int[][] matrix, int target) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == target) {
                    return new int[] {i,j} ;
                }

            }
        }

        return new int[]{-1, -1};
    }
}

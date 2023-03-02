package com.company;

public class maxNumArray {
    public static void main(String[] args) {

        // to print max value in Array

    int[] arr = {1,2,42,20,5};
        System.out.println(maxinrange(arr,3,4));

    }

    public static int maxval(int[] a ) {
        if(a.length==0){
            return -1;
        }

        int maxval = a[0];
        for (int i = 0; i <a.length ; i++) {
            if(maxval<a[i]){
                maxval=a[i];
            }
        }
        return maxval;
    }

    // to print max value in Array in between range

    public static int maxinrange(int[] a ,int index1,int index2)
    {
        if(a.length==0){
            return -1;
        }

        int maxval =a[index1];
        for (int i = index1; i <index2; i++) {
            if(maxval<a[i]){
                maxval=a[i];
            }

        }
        return maxval;
    }
}

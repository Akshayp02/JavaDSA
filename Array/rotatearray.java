package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class rotatearray {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7};
        int k =3;
        ReverseArray(num,0,num.length-k-1);
        System.out.println(Arrays.toString(num));

        ReverseArray(num,num.length-k,num.length-1);
        System.out.println(Arrays.toString(num));
        ReverseArray(num,0,num.length-1);
        System.out.println(Arrays.toString(num));


    }

    public static void ReverseArray(int[] a, int i ,int j){

        while(i<j){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
    }

}

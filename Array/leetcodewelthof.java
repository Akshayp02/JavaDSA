package com.company;

public class leetcodewelthof {
    public static void main(String[] args) {
///https://leetcode.com/problems/richest-customer-wealth/


    }
    public int maximumWealth(int[][] accounts) {
        // Persons = row
        //  accounts =col
        int ans = Integer.MIN_VALUE;
        for(int[] ints :accounts){
            // when you start a new col take a new sum for that row
            int sum =0;
            for(int anInt : ints){
                sum += anInt;
            }
            // now we have sum of accounts of person
            // check with overall ans
            if(sum >ans){
                ans =sum;
            }
        }
        return ans;
    }
}

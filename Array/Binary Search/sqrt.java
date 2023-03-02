package com.company;

public class sqrt {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(1));
    }
    public static boolean isPerfectSquare(int num) {
        if((Math.sqrt(num))%2!=0){
            return false;
        }

        return true;
    }
}

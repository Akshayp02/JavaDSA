package com.company;

public class palindromeProgram {
    public static void main(String[] args) {

        // EX. write a program for the check the given Sentence is palindrome or
        //     not return with boolean Expression

        // ans : ***********************************
        //      the palindrome means the given string we can read both of side l
        //      like " abcdcba " we can read it from both paths abcd.

        String pali = "";

        System.out.println(isPalindrome(pali));


    }

    public static boolean isPalindrome(String str) {
        if (str == null || str.length() == 0) {
            // this expression basically check given input is Empty
            return true;
        }
        // now we can compare the string with Starting and End position of the String
        // and we can find it by two parts of string


        str.toLowerCase();
        for (int i = 0; i < str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i); // hare we geting the last Index of str

            if(start!=end){
                return false;
            }

        }
        return true;
    }

}

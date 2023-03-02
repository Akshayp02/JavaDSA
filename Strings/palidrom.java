package com.company;

public class palidrom {
    public static void main(String[] args) {
        String pali = "aaa";

        System.out.println(isPalindrome(pali));
    }

    public static int isPalindrome(String str) {
        if (str == null || str.length() == 0) {
            // this expression basically check given input is Empty
            return -1;
        }
        // now we can compare the string with Starting and End position of the String
        // and we can find it by two parts of string

        int temp = 0;
        str.toLowerCase();
        for (int i = 0; i < str.length() / 2; i++) {
            int start = str[i];
            int end = str.charAt(str.length() - 1 - i);

            if (str.charAt(start) == str.charAt(end)) {
                temp = temp + 1;
                return temp;
            }

        }

        return -1;
    }

}

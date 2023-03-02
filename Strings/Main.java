package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        // This is the String builder class here we will the various on Strings

        // 1: String Concatenation

        String a = "Askahy";
        String b = "Peherkar";

        // basically it is the operation adding two Strings

//        System.out.println(a +" "+ b);


        // 2: String Formation ***************************

// EX. The problem is we have flot Number if we want to print just 2 digits after . ****
        float num = 12.1145f;
        System.out.printf("The number is %.2f", num);
        System.out.println(" ");

//        System.out.printf("my name is %a and iam a %b","okay","Engineer");


        //************* The String Performance

        // String series = "";

        StringBuilder series = new StringBuilder();
        series.toString();
        for (int i = 0; i < 26; i++) {

            char ch = (char) ('a' + i);
            System.out.println(ch);
           // series = series + ch;


        }
    }
}

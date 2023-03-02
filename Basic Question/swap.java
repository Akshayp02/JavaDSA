package com.company;

public class Main {

    public static void main(String[] args) {
	 int a = 10;
     int b = 20;
     swap(a,b);

    }


        // Function For swaping two Numbers
        private static void swap(int a, int b) {
        int temp = a;
        a = b ;
        b = temp;
        System.out.println(a + " " + b);
    }


}

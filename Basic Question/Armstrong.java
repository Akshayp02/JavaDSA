package com.company;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
//        int n = sc.nextInt();

//        System.out.println(isArmstrong(n));

        for(int i=100;i<1000;i++){

            if(isArmstrong(i)){
                System.out.println(i);
            }

        }



    }

    // Function for the Armstrong Number

    static boolean isArmstrong(int i){

        int orignal = i ;
        int sum = 0;


        while(i > 0){
            int rem = i % 10;
            i = i /10;
            sum = sum + rem*rem*rem;

        }

        return sum==orignal;
    }
}

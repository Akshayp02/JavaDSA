package com.company;

public class EvenNUMberinARR {
    public static void main(String[] args) {

        // ***** find even numbers in array ******/

        int[] arr ={12,11,22,15,85};
        System.out.println(EvenNums(arr));

    }

     static int EvenNums(int[] arr) {
        int ans =0;
        for(int num :arr){
            if(isEven(num)){
                ans++;
            }
        }
        return ans;
    }

    static boolean isEven(int i){
        int numOFDigi =digits(i) ;
        if( numOFDigi % 2 == 0){
            return true;
        }
        return false;
    }
    static int digits(int num){
        if(num < 0){
            num = num * -1;
        }
        if(num == 0){
            return 1;
        }

        int count = 0;
        while(num > 0){
            count++;
            num = num / 10;
        }
        return count;
    }
}

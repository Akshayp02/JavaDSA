package com.company;

public class leetcodesmallestletterBS {
    public static void main(String[] args) {
       char[] letters = {'x','x','y','y'};
        char target = 'z';
        System.out.println(nextGreatestLetter(letters,target));
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int start =0;
        int end = letters.length -1;

        while(start <= end){
            int mid = start + (end - start) /2;
            if(target < letters[mid]){
                end = mid - 1;
            }else if(target > letters[mid]){
                start = mid + 1 ;
            }
        }
        return letters[start % letters.length];
    }
}

package com.company;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        // variable Lenght Arguments
        func(1,2,3,4,44,77,90,87,54);

    }
    static void func(int ...v){
        System.out.println(Arrays.toString(v));
    }
}

package com.company;

public class PowOfTwo {
    public static void main(String[] args) {
        int n=16;
        boolean ans=power(n);
        System.out.println(ans);
    }

    static boolean power(int n){
        if(n==0){
            return false;
        }
        return ((n&(n-1))==0);
    }
}
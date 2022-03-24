package com.company;

public class Reverse1 {
    public static void main(String[] args) {
        int n=12345;
        System.out.println(rev(n));
    }

    static int rev(int n){
        if(n%10==n){
            return n;
        }
        return Integer.parseInt(Integer.toString(n%10)+rev(n/10));
    }
}
package com.company;

public class Palindrome {
    public static void main(String[] args) {
        int n =15445;
        System.out.println(palin(n));
    }

    static boolean palin(int n){
        return n==rev(n);
    }

    static int rev(int n){
        if(n%10==n){
            return n;
        }
        int d=(int)Math.log10(n)+1;
        return (n%10)*(int)(Math.pow(10,d-1))+rev(n/10);
    }
}

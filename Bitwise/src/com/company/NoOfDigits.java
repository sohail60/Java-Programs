package com.company;

public class NoOfDigits {
    public static void main(String[] args) {
        int n=10,base=2;
        int ans=digits(n,base);
        System.out.println(ans);
    }
    static int digits(int n,int base){
        return (int)(Math.log(n)/Math.log(base))+1;
    }
}
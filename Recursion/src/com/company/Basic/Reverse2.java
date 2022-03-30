package com.company;

public class Reverse2 {
    public static void main(String[] args) {
        System.out.println(rev(1254));
    }

    static int rev(int n){
        if(n%10==n){
            return n;
        }
        int d=(int)Math.log10(n)+1;

        return (n%10)*(int)(Math.pow(10,d-1))+rev(n/10);
    }
}

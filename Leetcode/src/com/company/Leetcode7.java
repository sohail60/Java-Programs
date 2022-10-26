package com.company;

public class Leetcode7 {
    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }

    public static int reverse(int x) {
        int n=x;
        int last=0,rev=0;

        while(x!=0){
            last=x%10;
            x=x/10;
            rev=rev*10+last;
            if(rev>Integer.MAX_VALUE/10 || rev< Integer.MIN_VALUE/10){
                return 0;
            }
        }
        return rev;
    }
}

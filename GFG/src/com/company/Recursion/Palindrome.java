package com.company.Recursion;

public class Palindrome {
    public static void main(String[] args) {
        int n =15445;
        System.out.println(isPalindromeNumber(n));
    }

    static boolean isPalindromeNumber(int n){
        return n==rev(n);
    }

    static int rev(int n){
        if(n%10==n){
            return n;
        }
        int d=(int)Math.log10(n)+1;
        return (n%10)*(int)(Math.pow(10,d-1))+rev(n/10);
    }

    static boolean isPlaindromeString(String str,int start,int end){
        if (start>=end){
            return true;
        }

        return ((str.charAt(start)==str.charAt(end))&&isPlaindromeString(str,start+1,end-1));
    }
}

package com.company;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = in.nextInt();
        int org = n;
        boolean ans = palin(n);
        System.out.println(ans);
    }


    static boolean palin(int n) {
        int a = 0, rev=0,org=n;
        while (n > 0) {
            a = n % 10;
            rev = rev * 10 + a;
            n=n/10;
        }
            return (org==rev);
        }
    }
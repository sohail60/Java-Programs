package com.company;

import java.util.Scanner;

public class ReverseNumber1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = in.nextInt();
        int a = 0;
        String rev = "";
        String temp=""+n;
        while (n > 0) {
            a = n % 10;
            rev = rev + a;
            n = n / 10;
        }

        System.out.println("Reverse="+rev);

        if(rev.equals(temp))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");


    }

    }
package com.company;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int c = 2;
        int temp = 0;
        while (c < n) {
            temp = b;
            b = b + a;
            a = temp;
            c++;
        }
        System.out.println("Sum="+b);
    }
    }

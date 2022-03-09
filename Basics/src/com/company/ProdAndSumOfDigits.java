package com.company;

import java.util.Scanner;
    //Q: Subtract the Product and Sum of Digits of a Number
public class ProdAndSumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = in.nextInt();
        int a = 0;
        int sum = 0;
        int prod = 1;
        while (n > 0) {
            a = n % 10;
            prod = prod * a;
            sum = sum + a;
            n = n / 10;
        }
    }
}


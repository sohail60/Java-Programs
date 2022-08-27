package com.company.Maths.Problems;

import java.util.Scanner;

public class DigitsInFactorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = in.nextInt();
        long fact=1;
        for(int i=1;i<=n;i++) {
            fact = fact * i;
        }
        int digits=(int)Math.log10(fact)+1;
        System.out.println("Digits in Factorial= "+ digits);
    }
}

package com.company.Maths.Problems;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = in.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++) {
            fact = fact * i;
        }
        System.out.println("Factorial="+fact);
    }
}
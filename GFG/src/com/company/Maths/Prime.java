package com.company.Maths;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = in.nextInt();
        int c;
        if (n <= 1)
            System.out.println("Neither Composite nor Prime");
            else {
            for (c = 2; c < n; c++) {
                if (n % c == 0) {
                    System.out.println("Not Prime");
                    break;
                }
            }

            if (c > n)
                System.out.println("Prime");
        }
    }

}
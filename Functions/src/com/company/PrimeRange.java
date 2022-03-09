package com.company;

import java.util.Scanner;

public class PrimeRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Starting:");
        int a = in.nextInt();
        System.out.println("Enter the Ending:");
        int b = in.nextInt();


        for (int i = a; i <= b; i++) {
            boolean ans = prime(i);
            if (ans)
                System.out.println(i);
        }
    }

        static boolean prime ( int n){
            if (n <= 1)
                return false;
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0)
                    return false;
            }
            return true;
        }
    }
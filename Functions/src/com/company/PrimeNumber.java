package com.company;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = in.nextInt();

        boolean ans = prime(n);
        if (ans)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
        static boolean prime(int n){
            if (n<=1)
                return false;
            for(int i=2;i*i<=n;i++) {
                if (n % i == 0)
                    return false;
            }
            return true;
        }
    }

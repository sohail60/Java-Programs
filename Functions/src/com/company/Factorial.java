package com.company;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = in.nextInt();

        int fact=fact(n);
        System.out.println("Factorial="+fact);
    }

            static int fact(int n){
            int fact=1;
             for(int i=1;i<=n;i++) {
                 fact = fact * i;
             }
             return fact;
}
    }


package com.company;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Element:");
        int n = in.nextInt();

        boolean answer = oddEven(n);

        if (answer) {
            System.out.println("Odd");
        }
        else {
            System.out.println("Even");
        }
    }

     static boolean oddEven(int n) {
        return ((n&1)==1) ;
    }
}
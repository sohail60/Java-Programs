package com.company;
//Q: Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

import java.util.Scanner;
public class InfiniteLoop1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter Numbers:");
        while (true) {
            int n = in.nextInt();
            if (n!=0)
                sum = sum + n;
            else
                break;
        }
        System.out.println("Sum="+sum);
        }
    }
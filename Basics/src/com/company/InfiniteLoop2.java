package com.company;
  //Q: Take integer inputs till the user enters 0 and print the largest number from all.

import java.util.Scanner;
public class InfiniteLoop2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max = 0;
        System.out.println("Enter Numbers:");
        while (true) {
            int n = in.nextInt();
            if(n!=0) {
                if (n > max)
                    max = n;
            }
            else
                break;
        }
        System.out.println("Max="+max);
    }
}
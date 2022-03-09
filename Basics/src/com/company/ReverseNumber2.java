package com.company;

import java.util.Scanner;

public class ReverseNumber2{
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the Number");
            int n = in.nextInt();
            int a = 0;
            int rev = 0;
            int temp = n;
            while (n > 0) {
                a = n % 10;
                rev = rev * 10 + a;
                n = n / 10;
            }

            System.out.println("Reverse=" + rev);
            if (rev == temp)
                System.out.println("Palindrome");
            else
                System.out.println("Not Palindrome");

        }
}

package com.company;

import java.util.Scanner;

public class Occurence
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=in.nextInt();
        System.out.println("Enter the Digit");
        int digit=in.nextInt();
        int a=0;int c=0;

        while(n>0) {
            a = n % 10;
            if (a == digit)
                c++;
            n = n / 10;
        }
                System.out.println("Occurence="+c);
        }
}

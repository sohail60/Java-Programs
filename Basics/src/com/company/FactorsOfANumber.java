package com.company;

import java.util.Scanner;

public class FactorsOfANumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = in.nextInt();
        System.out.println("Factors are:");
        for(int i=1;i<=n;i++)
        {if (n%i==0)
            System.out.println(i);

        }
    }
    }

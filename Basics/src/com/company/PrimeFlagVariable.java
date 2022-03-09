package com.company;

import java.util.Scanner;

public class PrimeFlagVariable {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=in.nextInt();
        int f=0;
        if (n<=1)
            System.out.println("Neither Composite nor Prime");
        else {
            for (int c = 2; c < n; c++) {
                if (n % c == 0)
                    f = 1;
            }

            if (f == 1)
                System.out.println("Not Prime");
            else
                System.out.println("Prime");
        }
    }
}

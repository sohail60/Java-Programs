package com.company;

import java.util.Scanner;

public class NaturalNoSum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n=in.nextInt();

        int sum=sum(n);
        System.out.println("Sum="+sum);
    }

    static int sum(int n){
        int sum=0;
        for(int i=1;i<=n;i++) {
            sum = sum + i;
        }
                return sum;
    }
}

package com.company;

import java.util.Scanner;

public class OneTimeCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;
        System.out.println("Enter Operator:");
        char op=in.next().trim().charAt(0);
        if (op=='+'|| op=='-'||op=='*'|| op=='/'||op=='%')
        { System.out.println("Enter two Numbers:");
        int n1 = in.nextInt();
        int n2 = in.nextInt();

            if (op == '+')
                ans = n1 + n2;
            if (op == '-')
                ans = n1 - n2;
            if (op == '*')
                ans = n1 * n2;
            if (op == '/') {
                if (n2 != 0) {
                    ans = n1 / n2;
                }
            else
                { System.out.println("Invalid");
                    ans = 0;
                }
            }
            if (op == '%') {
                ans = n1 % n2;
            }

            System.out.println("Answer="+ans);
        }
        else
            System.out.println("Enter Valid Operator");


    }
}
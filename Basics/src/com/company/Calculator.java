package com.company;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans=0;
        while(true)
        {System.out.print("Enter an Operator:");
            char op=in.next().trim().charAt(0);
         if (op=='+'|| op=='-'||op=='*'|| op=='/'||op=='%') {
             System.out.println("Enter Numbers:");
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
             else {
                     System.out.println("Invalid");
                     ans = 0;
                 }
         }
             if (op == '%')
                 ans = n1 % n2;
         }

             else if (op == 'x' || op =='X')
                 break;

             else
                 System.out.println("Invalid Operator");
            System.out.println("Answer="+ans);
         }
         }
}

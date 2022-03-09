package com.company;

import java.util.Scanner;

public class PythagoreanNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Numbers:");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        boolean ans=pyth(a,b,c);
                if(ans)
        System.out.println("Pythagorean Number");
                else
                    System.out.println("Not a Pythagorean Number");
    }
static boolean pyth(int a,int b,int c)
{return (a*a==b*b+c*c || c*c==a*a+b*b || b*b==a*a+c*c);
}
}

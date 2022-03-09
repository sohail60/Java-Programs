package com.company;

import java.util.Scanner;

public class Voter {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Your Age");
        int age=in.nextInt();

        boolean ans=eligible(age);
        if (ans)
            System.out.println("Eligible");
        else
            System.out.println("Not Eligible");
    }

    static boolean eligible(int n)
    {if (n>=18)
        return true;
        else
            return false;
    }
}

package com.company;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Marks:");
        int n = in.nextInt();

        System.out.println("Grade="+grade(n));
    }

    static String grade(int a) {
        if (a > 90)
            return "AA";
        else if (a > 80)
            return "AB";
        else if (a > 70)
            return "BB";
        else if (a > 60)
            return "BC";
        else if (a > 50)
            return "CD";
        else if (a > 40)
            return "DD";
        else
            return "Fail";
    }
}
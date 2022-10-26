package com.company.Fundamentals;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();

        while(T>0){
            int year = in.nextInt();
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    System.out.println("Yes");
                else
                    System.out.println("No");
            } else {
                if (year % 4 == 0)
                    System.out.println("Yes");
                else
                    System.out.println("No");
            }
        }
    }
}

package com.company;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number");
        int year = in.nextInt();

        if (year % 100 == 0) {
            if (year % 400 == 0)
                System.out.println("Leap Year");
            else
                System.out.println("Not A Leap Year");
        } else {
            if (year % 4 == 0)
                System.out.println("Leap Year");
            else
                System.out.println("Not A Leap Year");
        }
    }
}

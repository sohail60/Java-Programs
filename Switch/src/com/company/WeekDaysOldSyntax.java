package com.company;

import java.util.Scanner;

public class WeekDaysOldSyntax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Day Number:");
        int day = in.nextInt();
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("WeekDay");
                break;
            case 6:
            case 7:
                System.out.println("WeekEnd");
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
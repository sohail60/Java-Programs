package com.company;

import java.util.Scanner;
public class WeekDaysNewSyntax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Day Number:");
        int day = in.nextInt();

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("WeekEnd");
            default -> System.out.println("Invalid Input");
        }
    }
}

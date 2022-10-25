package com.company.Personalized.Fundamentals;

import java.util.Scanner;

public class LastDigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = n % 10;
        System.out.println(a);
    }
}
package com.company;

import java.util.Scanner;
public class VowelCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Alphabet:");
        char ch = in.next().trim().charAt(0);
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                System.out.println("Vowel");
            else
                System.out.println("Consonant");
        } else
            System.out.println("Invalid Input");
    }
}

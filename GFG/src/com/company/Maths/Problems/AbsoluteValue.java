package com.company.Maths.Problems;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();

        if (n >= 0) {
            System.out.println(n);
        } else {
            System.out.println(-1*n);
        }
    }
}

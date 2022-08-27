package com.company.Maths.Problems;

import java.util.Scanner;

public class CtoF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the temp in Celsius: ");
        float c=in.nextFloat();

        float f=(float)(c*1.8)+32;
        System.out.println("Temp in Fahrenheit= "+ f);
    }
}

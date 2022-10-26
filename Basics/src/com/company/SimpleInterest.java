package com.company;

import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Principal");
        double p=in.nextDouble();
        System.out.println("Enter Rate");
        double r=in.nextDouble();
        System.out.println("Enter Time in years");
        double t=in.nextDouble();

        double inst=p*r*t/100;
        System.out.println("Simple Interest="+inst);
    }
}

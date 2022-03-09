package com.company;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Radius:");
        double r=in.nextDouble();

        double area=area(r);
        double peri=peri(r);
        System.out.println("Area="+area);
        System.out.println("Perimeter="+peri);
    }

    static double area(double r){
        double area=Math.PI*r*r;
        return area;
    }

    static double peri(double r){
        double peri=2*Math.PI*r;
        return peri;
    }
}
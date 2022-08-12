package com.company;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number");
        int num= input.nextInt();

        if(num%2==0)
            System.out.println("EVEN");
        else
            System.out.println("ODD");


    }


}

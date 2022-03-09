package com.company;

import java.util.Scanner;

public class AddAndProd {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the two Numbers:");
        int num1=in.nextInt();
        int num2=in.nextInt();

        int sum=sum(num1,num2);
        int prod=prod(num1,num2);

        System.out.println("Sum="+sum);
        System.out.println("Product="+prod);
    }

        static int sum(int a,int b){
        int sum=a+b;
        return sum;
        }

    static int prod(int a,int b){
        int prod=a*b;
        return prod;
    }
}

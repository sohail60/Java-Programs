package com.company;

public class FactorialModularArithmetic {
    public static void main(String[] args) {
        int n=32;
        int M=47;

        long fact=1;
        for (int i = 2; i <=n ; i++) {
            fact=(fact*i%M)%M;
        }
        System.out.println(fact);
    }
}

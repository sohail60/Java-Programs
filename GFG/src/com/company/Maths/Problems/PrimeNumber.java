package com.company.Maths.Problems;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(prime(25));
    }

    public static boolean prime(int n){
        if (n<=1){
            return false;
        }

        for (int i = 2; i <= (int)Math.sqrt(n); i++) {
            if(n%i==0){
                return false;
            }
        }
            return true;
    }
    }
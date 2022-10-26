package com.company;

public class PrimeNumber {
    public static void main(String[] args) {
//        System.out.println(prime(25));
        int start=5,end=15;
        for (int i = start; i <= end; i++) {
            if (prime(i)){
                System.out.println(i);
            }
        }
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
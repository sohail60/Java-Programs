package com.company.Maths;

public class NoOfDigits {
    public static void main(String[] args) {

    }

    public static int countDigitsIterative(int n){
        int count=0;
        while (n!=0){
            n=n/10;
            count++;
        }
        return count;
    }

    public static int countDigitsRecursive(int n) {
        if (n==0){
            return 0;
        }
        return 1+countDigitsRecursive(n/10);
    }
}

package com.company.Maths;

public class GCD {
    public static void main(String[] args) {
        int a=4;
        int b=6;
        System.out.println(gcd1(a,b));
    }

    public static int gcd1(int a,int b){
        int small=Math.min(a,b);
        int large=Math.max(a,b);

        if(large%small==0){
            return small;
        }

        int result=0;

        for (int i = 1; i <= small ; i++) {
            if (small%i==0 &&large%i==0){
                result=i;
            }
        }
        return result;
    }

    public static int gcd2(int a,int b){
        if (b==0){
            return a;
        } else {
            return gcd2(b,a%b);
        }
    }
}
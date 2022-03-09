package com.company;


public class ThreeDigitArmStrong {
    public static void main(String[] args) {

        for(int i=100;i<1000;i++)
        { if(isArmstrong(i))
            System.out.println(i);
        }
    }


    static boolean isArmstrong(int n) {
        int a = 0;
        int org = n;
        int arm = 0;
        while (n > 0) {
            a = n % 10;
            arm = arm + a * a * a;
            n = n / 10;
        }
        return org == arm;
    }
    }

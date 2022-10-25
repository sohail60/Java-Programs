package com.company.Pattern_Problems;

public class Pattern15_22 {
    public static void main(String[] args) {

    }

    static void pattern15(int n){
        for (int row = n; row >=1; row--) {
            for (int col = 1; col <=row ; col++) {
                System.out.print((char)(col+64));
            }
            System.out.println();
        }
    }

    static void pattern16(int n){
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.print((char)(row+64));
            }
            System.out.println();
        }
    }

    static void pattern17(int n){
        for (int row = 1; row <=n ; row++) {
            for (int space = n-row; space >= 1; space--) {
                System.out.print(" ");
            }

            for (int col = 1; col <=row; col++) {
                System.out.print((char)(col+64));
            }

            for (int col = row-1; col >=1 ; col--) {
                System.out.print((char)(col+64));
            }
            System.out.println();
        }
    }

    static void pattern18(int n){
        for (int row = n; row >=1 ; row--) {
            for (int col = n; col >=row; col--) {
                System.out.print((char)(col+64)+" ");
            }
            System.out.println();
        }
    }
}

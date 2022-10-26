package com.company;

public class Pattern31_35 {
    public static void main(String[] args) {

    }

    static void pattern32(int n){
        for (int row = n; row >=1 ; row--) {
            for (int col = row; col <=n; col++) {
                System.out.print((char)(col+64)+" ");
            }
            System.out.println();
        }
    }

    static void pattern35(int n){
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.print(col+" ");
            }

            for (int space = n-row; space >=1 ; space--) {
                System.out.print("  ");
            }

            for (int space = n-row; space >=1 ; space--) {
                System.out.print("  ");
            }

            for (int col = row; col >=1; col--) {
                System.out.print(col+" ");
            }

            System.out.println();
        }
    }
}

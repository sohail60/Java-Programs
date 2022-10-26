package com.company;

public class Pattern16_20 {
    public static void main(String[] args) {
        pattern22(5);
    }



    static void pattern17(int n){
        for (int row = 1; row <=(2*n)-1 ; row++) {
            int num=(row<=n)?row:n-(row%n);
            int space=(row<=n)?n-row:(row%n);
            for (int i = 1; i <=space ; i++) {
                System.out.print(" ");
            }
            for (int col = num; col >=1 ; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <=num ; col++) {
                System.out.print(col);
            }
            System.out.println();
                }
            }

    static void pattern22(int n){
        for (int row = 1; row <=n; row++) {
            for (int col = 1; col <= n-1; col++) {
                if(col == 1 || col == n-1 || row == 1 || row == n){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
        }
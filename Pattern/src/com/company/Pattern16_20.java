package com.company;

public class Pattern16_20 {
    public static void main(String[] args) {
        pattern17(4);
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
        }
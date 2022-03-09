package com.company;

public class Pattern26_30 {
    public static void main(String[] args) {
        pattern30(5);
    }

    static void pattern26(){
        for (int row = 1; row <=6 ; row++) {
            for (int col = row; col <=6 ; col++) {
                System.out.print(row);
            }
            System.out.println();
        }
    }

    static void pattern28(int n){
        for (int row = 1;row<=(2*n)-1; row++) {
            int star=(row<=n)?row:n-(row%n);
            int spaces=(row<=n)?n-row:row%n;
            for (int i = 1; i <= spaces; i++) {
                System.out.print(" ");
            }
            for (int col = 1;col <=star; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern30(int n){
        for (int row = 1; row <=n ; row++) {

            for (int space = 1; space <=n-row ; space++) {
                System.out.print("  ");
            }
                for (int col = row; col >=1 ; col--) {
                    System.out.print(col+" ");
                }

                for (int col = 2; col <=row ; col++) {
                    System.out.print(col+" ");
                }
            System.out.println();
            }
        }
    }
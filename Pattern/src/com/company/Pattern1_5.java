package com.company;
  //  Questions:https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/09-patterns.md

public class Pattern1_5 {
    public static void main(String[] args) {
        pattern5(5);
    }


    static void pattern1(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for (int row = 1; row <=n; row++) {
            for (int col = 5; col >=row ; col--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }


    static void pattern5(int n){
        for (int row = 1;row<=(2*n)-1; row++) {
            int star=(row<=n)?row:n-(row%n);
                for (int col = 1;col<=star; col++) {
                    System.out.print("* ");
                }
            System.out.println();
            }
        }
    }
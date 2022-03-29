package com.company;

public class Pattern {
    public static void main(String[] args) {
        print2(5);
    }


    static void print1(int n) {
        helper1(n, 0);
    }

    static void helper1(int row, int col) {
        if (row == 0) {
            return;
        }

        if (col < row) {
            System.out.print("*");
            helper1(row, col + 1);
        } else {
            System.out.println();
            helper1(row - 1, 0);
        }
    }

    static void print2(int n){
        helper2(n, 0);
    }

    static void helper2(int row, int col){
        if (row == 0) {
            return;
        }
        if (col < row) {
            helper2(row, col + 1);
            System.out.print("*");
        } else {
            helper2(row - 1, 0);
            System.out.println();
        }
    }
}
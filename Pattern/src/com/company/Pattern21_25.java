package com.company;

public class Pattern21_25 {
    public static void main(String[] args) {

    }

    static void pattern21(int n){
        int count=1;
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}

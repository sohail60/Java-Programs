package com.company;

public class Wealth {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}};
        int ans = wealth(arr);
        System.out.println("Max Wealth="+ans);
    }


     static int wealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;int sum=0;
        for (int row = 0; row < accounts.length; row++) {
            sum=0;
            for (int col = 0; col < accounts[row].length; col++) {
                sum = sum + accounts[row][col];
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}

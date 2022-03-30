package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Array2DMax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] array = {
                {1, 24, 32},
                {14, 5, 62, 45},
                {7, 100, 9, 89},
                {94, 34}
        };

        int max=max(array);
        System.out.println("Max="+max);
    }

    static int max(int[][] arr){
        int max=arr[0][0];
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(max<arr[row][col]){
                    max=arr[row][col];
                }
            }
        }
        return max;
    }
}

package com.company;
    // It returns boolean value if the target is found or not

import java.util.Scanner;
public class ArraySearch2D_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] array = {
                {1, 24, 32},
                {14, 5, 62, 45},
                {7, 8, 9, 89},
                {94, 34}
        };

        System.out.println("Enter the Target:");
        int target = in.nextInt();

        boolean ans = search(array, target);
        if (ans)
            System.out.println("Found");
        else
            System.out.println("Not Found");
    }

    static boolean search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return true;
                }
            }
        }
        return false;
    }
}
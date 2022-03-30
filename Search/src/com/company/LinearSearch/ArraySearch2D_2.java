package com.company;
    //It will return the Row and Column if the target is found

import java.util.Arrays;
import java.util.Scanner;
public class ArraySearch2D_2 {
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

        System.out.println(Arrays.toString(search(array,target)));
    }

    static int[] search(int[][] arr, int target){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(target==arr[row][col]){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
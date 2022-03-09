package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[][] array= {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

//        int[][] array=new int[3][3];
//        for(int row=0;row<3;row++){
//            for(int col=0;col<3;col++) {
//                array[row][col] = in.nextInt();
//            }
//            }

        //System.out.println(Arrays.toString(arr));

//        for(int row=0;row<array.length;row++){
//            for(int col=0;col<array[row].length;col++){
//                System.out.print(array[row][col]+" ");
//            }
//            System.out.println("");
//        }

//        for(int row=0;row<3;row++){
//            System.out.println(Arrays.toString(array[row]));
//        }

        for(int[] row: array){
            System.out.println(Arrays.toString(row));
        }
    }
}
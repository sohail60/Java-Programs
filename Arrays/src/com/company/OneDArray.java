package com.company;


import java.util.Arrays;
import java.util.Scanner;

public class OneDArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr={1,2,3,4,5};
        //System.out.println(Arrays.toString(arr));

        for(int a:arr) {
            System.out.print(a + " ");
        }
    }
}
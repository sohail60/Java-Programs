package com.company;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 5, 4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr) {
        int r = arr.length;
        helper(arr, r, 0, arr[0]);
    }

    static void helper(int[] arr, int r, int c, int max) {
        if (r == 0) {
            return;
        }

        if (c <r) {
            if (max < arr[c]) {
                max = arr[c];
            }
            helper(arr, r, c + 1, max);
        }
        else{
            int temp=max;
            max=arr[r-1];
            arr[r-1]=temp;
            helper(arr,r-1,0,arr[0]);
        }
    }
}
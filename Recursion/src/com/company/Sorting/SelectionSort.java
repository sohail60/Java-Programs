package com.company.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5,-5,0};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr) {
        int r = arr.length;
        helper(arr, r, 0, arr[0],0);
    }

    static void helper(int[] arr, int r, int c, int max,int maxIndex) {
        if (r == 0) {
            return;
        }
        if (c <r) {
            if (max < arr[c]) {
                max = arr[c];
                maxIndex=c;
            }
            helper(arr, r, c + 1, max,maxIndex);
        }
        else{
            int temp=arr[r-1];
            arr[r-1]=arr[maxIndex];
            arr[maxIndex]=temp;
            helper(arr,r-1,0,arr[0],0);
        }
    }
}
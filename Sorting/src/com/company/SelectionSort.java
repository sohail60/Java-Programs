package com.company;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr={2,9,77,0,-45,28};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

     static void selectionSort(int[] arr) {
         for (int i = 0; i <=arr.length-1 ; i++) {
             int end=arr.length-i-1;
             int maxIndex=max(arr,end);
             swap(arr,maxIndex,end);
         }
    }

    static int max(int[] arr,int end) {
        int max=arr[0],maxIndex=0;
        for (int i = 0; i <=end ; i++) {
            if(arr[i]>max){
                max=arr[i];
                maxIndex=i;
            }
        }
    return maxIndex;
    }

    static void swap(int[] arr, int max,int end){
        int temp=arr[max];
        arr[max]=arr[end];
        arr[end]=temp;
    }
}
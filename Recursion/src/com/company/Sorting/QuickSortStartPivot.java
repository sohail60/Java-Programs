package com.company.Sorting;

import java.util.Arrays;

public class QuickSortStartPivot {
    public static void main(String[] args) {
        int[] arr={10,16,8,12,15,6,3,9,5};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] arr,int low,int high){

        if(high>low){
            int j=partition(arr,low,high);
            quickSort(arr,low,j);
            quickSort(arr,j+1,high);
        }
    }

    static int partition(int[] arr,int low, int high){
        int start=low;
        int end=high;
        int pivot=arr[low];

        while(end>start){

            while(pivot>=arr[start]){
                start++;
            }

            while(pivot<arr[end]){
                end--;
            }

            if(end>start){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            }
        }

        int temp=arr[end];
        arr[end]=arr[low];
        arr[low]=temp;

        return end;
    }
}

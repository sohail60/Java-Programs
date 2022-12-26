package com.company.Sorting;

import java.util.Arrays;

public class QuickSortStartPivot {
    public static void main(String[] args) {
        int[] arr={4,1,3,9,7};
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

            while(arr[start]<=pivot && start<=high-1){
                start++;
            }

            while(arr[end]>pivot && end>=low){
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

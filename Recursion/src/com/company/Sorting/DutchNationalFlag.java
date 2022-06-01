package com.company.Sorting;

import java.util.Arrays;

public class DutchNationalFlag {
    public static void main(String[] args) {
        int[] arr={1,1,2,0,0,1,2,2,1,0};
        System.out.println(Arrays.toString(arr));
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] arr){

        int low=0;
        int mid=0;
        int high=arr.length-1;

        while(high>mid){

            if(arr[mid]==0){
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                low++;
                mid++;
            }

            if(arr[mid]==1){
                mid++;
            }

            if(arr[mid]==2){
                int temp=arr[high];
                arr[high]=arr[mid];
                arr[mid]=temp;
                high--;
            }

        }
    }
}

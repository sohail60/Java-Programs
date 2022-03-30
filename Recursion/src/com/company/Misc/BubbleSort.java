package com.company;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={3,1,2,4,5,0};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }


    static void sort(int[] arr){
        int r=arr.length;
        helper(arr,r,1);
    }
    static void helper(int[] arr, int r,int c){
        if(r==0){
            return;
        }

        if(c<r){
            if(arr[c]<arr[c-1]){
                int temp=arr[c];
                arr[c]=arr[c-1];
                arr[c-1]=temp;
            }
            helper(arr,r,c+1);
        }
        else{
            helper(arr,r-1,1);
        }
    }
}

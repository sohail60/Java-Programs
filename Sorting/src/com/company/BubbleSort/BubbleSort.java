package com.company;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={1,9,7,54,-45,0,36};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }



    static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int flag=0;
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j]<arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    flag=1;
                }
            }
            if(flag==0){
                break;
            }
        }
    }
}

package com.company.Arrays;

import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr={3,8,15,14,7};
//        int[] arr={10,10,10};
        System.out.println(secondLargest(arr));
    }

    public static int secondLargest(int[] arr){
        int n=arr.length;
        int max=arr[0];
        int secondMax=arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i]>secondMax && secondMax!=max){
                secondMax=arr[i];
            }
            if (arr[i]>max){
                max=arr[i];
            }
        }
        if (secondMax==Integer.MIN_VALUE){
            return -1;
        }
        return secondMax;
    }
}

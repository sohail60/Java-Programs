package com.company.Arrays;

public class MaximumDifference {
    public static void main(String[] args) {
        int[] arr={2,1,1,1};
        int answer=maxDiff2(arr);
        System.out.println(answer);
    }

    static int maxDiff1(int[] arr){
        int max=arr[1]-arr[0];
        int n=arr.length;

        for (int i = 0; i < n-1; i++) {
            for (int j=i+1; j < n; j++){
                max=Math.max(max,arr[j]-arr[i]);
            }
        }
        return max;
    }

    static int maxDiff2(int[] arr){
        int max=arr[1]-arr[0];
        int n=arr.length,minElement=arr[0];

        for (int i = 1; i < n; i++) {
            max=Math.max(max,arr[i]-minElement);
            minElement=Math.min(minElement,arr[i]);
        }
        return max;
    }
}
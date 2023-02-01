package com.company;

public class NumberOfRotations {
    public static void main(String[] args) {
        int[] arr={5, 1, 2, 3, 4};
        int ans=rotations(arr);
        System.out.println(ans);
    }

    static int rotations(int[] arr){
        int peakIndex=peakIndex(arr);

        if(peakIndex==-1){
            return 0;
        }
        return peakIndex+1;
    }

    static int peakIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid <end && arr[mid] > arr[mid+1]) {
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }

            if(arr[mid]>=arr[start]){
                start=mid+1;
            } else if(arr[mid]<arr[start]){
                end=mid-1;
            }
        }
        return -1;
    }
}

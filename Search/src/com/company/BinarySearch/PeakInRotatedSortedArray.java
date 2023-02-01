package com.company;

public class RotatedSortedArray {
    public static void main(String[] args) {
        int[] arr={5, 6, 7, 8, 9, 10, 1, 2, 3};
        int ans=peakIndex(arr);
        System.out.println(arr[ans]);
    }

    static int peakIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid+1]) {
                return mid;
            }
            if(arr[mid]<arr[mid-1]){
                return mid-1;
            }

            if(mid>=start){
                start=mid+1;
            } else if(mid<start){
                end=mid-1;
            }
        }
        return -1;
    }
}

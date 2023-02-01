package com.company;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
    int[] arr={1,3};
    int target=0;
    int ans=helper(arr,target);
    System.out.println(ans);
    }

    static int helper(int[] arr,int target){
        int peak=peakIndex(arr);

        int left=search(arr,target,0,peak);
        if(left!=-1){
            return left;
        }
        int right=search(arr,target,peak+1,arr.length-1);
        return right;
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

    static int search(int[] arr, int target,int start,int end) {
        if(arr.length==0){
            return -1;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else if (target == arr[mid]) {
                return mid;
            }
        }
        return -1;
    }
}

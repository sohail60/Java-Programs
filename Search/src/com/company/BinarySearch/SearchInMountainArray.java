package com.company;

import java.util.Scanner;

public class SearchInMountainArray {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr={1,2,3,4,5,3,1};
        int target=3;
        int ans=SearchInMountainArr(arr,target);
        System.out.println("Answer="+ans);
    }

    static int SearchInMountainArr(int[] arr,int target){
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

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid+1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    static int search(int[] arr, int target,int start,int end) {
        if (arr.length == 0) {
            return -1;
        }
        while (end >= start) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (arr[start] >= arr[end]) {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                }
            }
            else if (arr[start] < arr[end]) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}

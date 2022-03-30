package com.company;

import java.util.Scanner;

public class MountainArray {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr={2,5,3,1,-5,-10};

        int max=mountain(arr);
        System.out.println("Max="+max);
    }

    static int mountain(int[] arr){
        int start=0,end=arr.length-1;int max=0;
        while(end>=start){
            int mid=start+(end-start)/2;
            if(mid!=0 && mid!=arr.length-1) {
                if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                    max = mid;
                }
            }
            if(arr[mid]>arr[mid-1]){
                start=mid+1;
            }
            if(arr[mid]>arr[mid+1]){
                end=mid-1;
            }
        }
        return max;
    }
}

package com.company;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 9, 11, 12, 14, 20, 36, 48};
        int target=36;

        System.out.println(search(arr,target,0,arr.length-1));
    }


    static int search(int[] arr,int target,int start,int end){

        if(start>end){
            return -1;
        }

        int mid=start+(end-start)/2;

        if(target==arr[mid]){
            return mid;
        }
        else if(target>arr[mid]){
            start=mid+1;
           return search(arr,target,start,end);
        }
        else{
            end=mid-1;
            return search(arr,target,start,end);
        }
        }
    }
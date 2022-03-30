package com.company;

public class ArraySearch4 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 96, 48, 14, 52, 36, 78, 64};
        int target = 52;
        int ans = search(arr, target);
        if(ans==Integer.MAX_VALUE) {
            System.out.println("Not Found");
        }
        else{
            System.out.println("Element="+ans);
        }
    }

        static int search(int[] arr,int target){
            if (arr.length == 0) {
                return Integer.MAX_VALUE;
            }
        for(int element : arr){
            if(element==target) {
                return element;
            }
            }
        return Integer.MAX_VALUE;
        }
        }
package com.company;

public class IsArraySorted {
    public static void main(String[] args) {
        int[] arr={2,5,7,46,90};
        System.out.println(sorted(arr));
    }

    static boolean sorted(int[] arr){
        return helper(arr,0);
    }

    static boolean helper(int[] arr,int start){
        if(start==arr.length-1){
            return true;
        }
        return (arr[start]<arr[start+1]&& helper(arr,start+=1));
    }
}
package com.company;

public class LinearSearchBoolean {
    public static void main(String[] args) {
        int[] arr={2,8,15,11,7};
        int target=7;
        System.out.println(search(arr,target));
    }

    static boolean search(int[] arr, int target){
        return helper(arr,target,0);
    }

    static boolean helper(int[] arr,int target,int index){
        if(index==arr.length){
            return false;
        }
        return (arr[index]==target || helper(arr, target, index+1));
    }
}

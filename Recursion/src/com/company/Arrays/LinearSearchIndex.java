package com.company;

public class LinearSearchIndex {
    public static void main(String[] args) {
        int[] arr={2,8,15,11,7};
        int target=11;
        System.out.println(search(arr,target));
    }

    static int search(int[] arr, int target){
        return helper(arr,target,0);
    }

    static int helper(int[] arr,int target,int index){
        if(index==arr.length){
            return -1;
        }
         if (arr[index]==target){
             return index;
         }
         else{
             return helper(arr, target, index+1);
         }
    }
}
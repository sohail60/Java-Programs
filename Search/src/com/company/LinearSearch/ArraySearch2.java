package com.company;
    // This program returns the element if found
public class ArraySearch2 {
    public static void main(String[] args) {
        int[] arr={1,5,96,48,14,52,36,78,64};
        int target=52;
        int ans=search(arr,target);
        if(ans!=Integer.MAX_VALUE)
        System.out.println("Element="+ans);
        else
            System.out.println("Element doesn't exist");
    }


    static int search(int[] arr,int target){
        if (arr.length == 0) {
            return Integer.MAX_VALUE;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return arr[i];
            }
        }
        return Integer.MAX_VALUE;
    }
}

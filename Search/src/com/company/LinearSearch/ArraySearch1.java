package com.company;

//This program return int
public class ArraySearch1 {
    public static void main(String[] args) {
        int[] arr={1,5,96,48,14,52,36,78,64};
        int target=52;
        int ans=search(arr,target);
        System.out.println("Found at Index="+ans);
    }

    static int search(int[] arr,int target) {
        if (arr.length == 0){
            return -1;
    }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target) {
                return i;
            }
            }
        return -1;  //-1 means the element is not present in the array because the index can't be -1
        }
}

package com.company;
    //This program returns boolean value
public class ArraySearch3 {
    public static void main(String[] args) {
        int[] arr={1,5,96,48,14,52,36,78,64};
        int target=52;
        boolean ans=search(arr,target);
        if(ans) {
            System.out.println("Found");
        }
            else {
            System.out.println("Not Found");
        }
        }

    static boolean search(int[] arr,int target) {
        if (arr.length == 0){
            return false;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target) {
                return true;
            }
        }
        return false;
    }
}
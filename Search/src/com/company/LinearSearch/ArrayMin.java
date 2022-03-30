package com.company;

import java.util.Scanner;

public class ArrayMin {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr=new int[5];
        System.out.println("Enter the Array:");
        for(int i=0;i<5;i++){
            arr[i]=in.nextInt();
        }
         int min=min(arr);
        System.out.println("Min="+min);
    }

    static int min(int[] arr){
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
}

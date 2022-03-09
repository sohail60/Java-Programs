package com.company;

import java.util.Scanner;

import java.util.Scanner;
public class ArraySearchRange {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr=new int[5];
        System.out.println("Enter the Array:");
        for(int i=0;i<5;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("Enter the Number to be Found:");
        int target=in.nextInt();

        System.out.println("Enter the Starting Index:");
        int start=in.nextInt();
        System.out.println("Enter the Ending Index:");
        int end=in.nextInt();
        int ans=search(arr,target,start,end);
        if(ans==-1) {
            System.out.println("Not Found");
        }
        else {
            System.out.println("Found at Index="+ans);
        }
    }

    static int search(int[] arr,int target,int start,int end) {
        if (arr.length == 0){
            return -1;
        }
        for(int i=start;i<=end;i++){
            if(arr[i]==target) {
                return i;
            }
        }
        return -1;
    }
}

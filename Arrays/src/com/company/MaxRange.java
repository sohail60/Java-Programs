package com.company;

import java.util.Scanner;

public class MaxRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[4];
        System.out.println("Enter The Numbers:");
        for (int i = 0; i < 4; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the Starting Index");
            int start=in.nextInt();
        System.out.println("Enter the Ending Index");
            int end=in.nextInt();

            int maxr=maxr(arr,start,end);
        System.out.println("Max in the Range="+maxr);

    }

    static int maxr(int[] num,int start, int end){
        if(start>end)
            return -1;
        if(num==null)
            return -1;

        int max=num[start];

        for(int i=start;i<=end;i++){
            if(num[i]>max) {
                max=num[i];
            }
        }
        return max;


    }
}
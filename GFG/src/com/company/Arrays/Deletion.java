package com.company.Arrays;

import java.util.Arrays;

public class Deletion {
    public static void main(String[] args) {
        int[] arr={3,8,15,14,7};
        int x=7;
        int i=Integer.MAX_VALUE;
        System.out.println(i);
        System.out.println(Arrays.toString(deletion(arr,x)));
    }

    public static int[] deletion(int[] arr,int x){
        int index=-1,n=arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i]==x){
                index=i;
                break;
            }
        }
        if (index!=-1){
            for (int i = index; i < n-1; i++) {
                arr[i]=arr[i+1];
            }
            arr[n-1]=0;
        }
        return arr;
    }
}

package com.company;

import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {
        int[] arr={0,2,4,5,10,8,-5,42,15};
        int target=15;
        int[] ans=q1(arr,target);
        System.out.println(Arrays.toString(ans));

    }

    static int[] q1(int[] arr,int target){
        int sum=0;
        int[] ans={-1,-1};
        for (int i = 0; i <= arr.length-1; i++) {
            for (int j = i+1; j <=arr.length-1 ; j++) {
                sum=arr[i]+arr[j];
                if(sum==target){
                    ans[0]=arr[i];
                    ans[1]=arr[j];
                    return ans;
                }
            }
        }
        return ans;
    }
}

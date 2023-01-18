package com.company.VariableSize;

public class LargestSubarrayWithSumK {
    public static void main(String[] args) {
        int[] arr={10, 5, 2, 7, 1, 9};
        int k=15;
        System.out.println(largestSubarray(arr,k));
    }

    static int largestSubarray(int[] arr,int k){
        int n=arr.length;
        int i=0,j=0,max=Integer.MIN_VALUE;
        long sum=0;
        while (j<n){
            sum=sum+arr[j];
            if(sum<k){
                j++;
            } else if(sum==k){
                max=Math.max(max,j-i+1);
                j++;
            } else if(sum>k){
                while(sum>k){
                    sum=sum-arr[i];
                    i++;
                }
                j++;
            }
        }
        return max;
    }
}

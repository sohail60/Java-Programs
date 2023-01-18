package com.company.FixedSize;

    public class MaxSumOfSubarray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 1};
        int k=3;
        System.out.println(maxSum(arr,k));
    }

    static int maxSum(int[] arr,int k){
        int n=arr.length;
        int i=0,j=0,sum=0,max=Integer.MIN_VALUE;

        while(j<n){
            sum+=arr[j];

            if (j-i+1<k){
                j++;
            } else if (j-i+1==k){
                max=Math.max(max,sum);
                sum=sum-arr[i];
                i++;
                j++;
            }
        }
        return max;
    }
}

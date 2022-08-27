package com.company.Arrays;

public class ConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr={0,0};
        int answer=consecutive(arr);
        System.out.println(answer);
    }

    public static int consecutive(int[] arr){
        if (arr.length==1){
            if (arr[0] == 1){
                return 1;
            } else {
                return 0;
            }
        }
        int c=0,updatedCounter=0,n=arr.length;
        for (int i = 0; i < n-1; i++) {
            if (arr[i]==arr[i+1] && arr[i]==1){
                c++;
            } else {
                updatedCounter=Math.max(c,updatedCounter);
                c=0;
            }
        }
        return updatedCounter+1;
    }
}

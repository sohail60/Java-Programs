package com.company.FixedSize;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class FirstNegativeNumberInSubarrays {
    public static void main(String[] args) {
        int[] arr={-8, 2, 3, -6, 10};
        int k=2;
        System.out.println(Arrays.toString(firstNegative(arr,k)));
    }

    static int[] firstNegative(int[] arr,int k){
        int n=arr.length;
        int i=0,j=0;
        Queue<Integer> queue=new LinkedList<>();
        int[] result=new int[n-k+1];

        while(j<n){
            if(arr[j]<0){
                queue.offer(arr[j]);
            }
            if(j-i+1<k){
                j++;
            } else if(j-i+1==k){
                if(queue.size()==0){
                    result[i]=0;
                } else {
                result[i]=queue.peek();
                if(arr[i]==queue.peek()){
                    queue.poll();
                }
                }
                i++;
                j++;
            }
        }
        return result;
    }
}

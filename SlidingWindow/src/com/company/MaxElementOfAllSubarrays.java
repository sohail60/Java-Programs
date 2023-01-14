package com.company;

import java.util.Deque;
import java.util.LinkedList;

public class MaxElementOfAllSubarrays {
    public static void main(String[] args) {

    }

    static int[] maxofSubarrays(int[] arr,int k){
        int n=arr.length;
        int i=0,j=0;

        int[] result=new int[n-k+1];
        Deque<Integer> queue=new LinkedList<>();

        while (j<n){
            while (queue.size()>0 && queue.peekLast()<arr[j]){
                queue.pollLast();
            }
            queue.offerLast(arr[j]);

            if(j-i+1<k){
                j++;
            } else if (j-i+1==k){
                if(queue.size()!=0){
                result[i]=queue.peek();
                }

                if(queue.size()!=0){
                    if(queue.peek()==arr[i]){
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

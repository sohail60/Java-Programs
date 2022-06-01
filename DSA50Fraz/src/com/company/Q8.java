package com.company;

import java.util.Arrays;

public class Q8 {
    public static void main(String[] args) {
        int[] arr={2,5,26,2,2,2,2};
        int ans=majority(arr);
        System.out.println(ans);
    }

    static int majority(int[] arr){
        for (int i = 0; i <=arr.length-1 ; i++) {
            int c=1;
            for (int j = i+1; j <=arr.length-1 ; j++) {
                if(arr[i]==arr[j]){
                    c++;
                }
            }
            if(c>(arr.length/2)){
                return arr[i];
            }
        }
        return -1;
    }
}

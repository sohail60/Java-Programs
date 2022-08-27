package com.company.Arrays;

import java.util.Arrays;

public class Leader {
    public static void main(String[] args) {
        int[] arr={7,10,4,3,6,5,2};
//        leader1(arr);
        leader2(arr);
    }

    public static void leader1(int[] arr){
        int n=arr.length;

        for (int i = 0; i < n-1; i++) {
            int flag=0;
            for (int j = i+1; j < n; j++) {
                if (arr[i]<=arr[j]){
                    flag=1;
                    break;
                }
            }
            if (flag==0){
                System.out.print(arr[i]+"  ");
            }
        }
        System.out.print(arr[n-1]);
    }

    public static void leader2(int[] arr){
        int n=arr.length;

        int currLeader=arr[n-1];
        System.out.print(currLeader+"  ");

        for (int i = n-2; i >=0 ; i--) {
            if (arr[i]>currLeader){
                currLeader=arr[i];
                System.out.print(currLeader+"  ");
            }
        }
    }
}

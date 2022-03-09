package com.company;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr=new int[4];
        System.out.println("Enter The Numbers:");
        for(int i=0;i<4;i++) {
            arr[i] = in.nextInt();
        }
        int max=max(arr);
        System.out.println("Max="+max);
    }

    static int max(int[] num){

        if(num==null)
            return -1;

        int max=num[0];

        for(int i=1;i<4;i++) {
            if (num[i] > max) {
                max =num[i];
            }
        }
           return max;
    }
}
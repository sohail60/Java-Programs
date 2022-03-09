package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[4];
        System.out.println("Enter The Numbers:");
        for (int i = 0; i < 4; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int end=arr.length -1;
        int start=0;
        reverse(arr,start,end);
        System.out.println(Arrays.toString(arr));
    }

    static int[] reverse(int[] num,int start,int end){
        while(start<end) {
            swap(num, start, end);
            start++;
            end--;
        }
        return num;
        }

    static int[] swap(int[]num,int a,int b){
        int temp=num[a];
        num[a]=num[b];
        num[b]=temp;
        return num;
    }
}
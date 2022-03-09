package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Span {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int min=arr[0], max=arr[0];
        for(int i=0;i<n-1;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("Max="+max);
        System.out.println("Min="+min);
        int span=max-min;
        System.out.println("Span="+span);
    }
}

package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Add2Arrays {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the length of 1st Array:");
        int num1=in.nextInt();
        System.out.println("Enter the 1st Array:");
        int[] arr1=new int[num1];
        for(int i=0;i<num1;i++){
            arr1[i]=in.nextInt();
        }
        System.out.println("Enter the length of 2nd Array:");
        int num2=in.nextInt();
        System.out.println("Enter the 2nd Array:");
        int[] arr2=new int[num2];
        for(int i=0;i<num2;i++){
            arr2[i]=in.nextInt();
        }

        int max=0;
        if(num1>=num2){
            max=num1;
        }
        else{
            max=num2;
        }

        int[] arr3=new int[max];

        int d=0,carry=0;
        int i=arr1.length-1;
        int j=arr2.length-1;
        int k=arr3.length-1;

        while(k>=0){
            d=carry;

            if(i>=0){
                d=d+arr1[i];
            }
            if(j>=0){
                d=d+arr2[j];
            }

            carry=d/10;
            d=d%10;

            arr3[k]=d;

            i--;
            j--;
            k--;
        }

        if(carry!=0){
            System.out.println(carry);
        }

        for(int val:arr3){
            System.out.println(val);
        }
    }
}

package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Inverse {
    public static void main(String[] args) {
        int[] arr={3,4,1,2,0};

        int temp=0;

        for(int i=0;i<5;i++) {
            temp = arr[arr[i]];
            arr[arr[i]]=i;
            arr[arr[i]] = i;
        }

        for(int i=0;i<5;i++){

        }
        System.out.println(Arrays.toString(arr));
    }
}
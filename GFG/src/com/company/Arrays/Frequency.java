package com.company.Arrays;

import java.util.Arrays;

public class Frequency {
    public static void main(String[] args) {
        int[] arr={10};
        frequency(arr);
//        System.out.println(Arrays.toString(arr));
    }

    public static void frequency(int[] arr){
        int c=1,n=arr.length;

        for (int i = 0; i < n-1; i++) {
            if (arr[i]==arr[i+1]){
                c++;
            } else {
                System.out.println(arr[i]+"     "+c);
                c=1;
            }
        }
        System.out.println(arr[n-1]+"     "+c);
    }
}

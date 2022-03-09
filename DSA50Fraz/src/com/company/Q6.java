package com.company;

public class Q6 {
    public static void main(String[] args) {
        int[] arr = {9,9,5};
        int ans=unique(arr);
        System.out.println(ans);
    }

    static int unique(int[] arr) {
        int unique = Integer.MIN_VALUE;

        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[i] == arr[j]) {
                    break;
                }
                else{
                    unique=arr[i];
                }
            }
        }
        return unique;
    }
    }

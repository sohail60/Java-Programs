package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr = {2, 6, 8, 1, 0, -40, 2};
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
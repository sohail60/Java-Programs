package com.company;

public class Q9 {
    public static void main(String[] args) {
        int[] arr = {2, 8, 77, 9, 45, 51, 0, 51};
        int ans=duplicate(arr);
        System.out.println(ans);
    }

    static int duplicate(int[] arr) {
        int duplicate = Integer.MIN_VALUE;

        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[i] == arr[j]) {
                    duplicate = arr[i];
                }
            }
        }
        return duplicate;
    }
}
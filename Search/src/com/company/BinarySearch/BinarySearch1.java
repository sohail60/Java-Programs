package com.company;

import java.util.Scanner;

public class BinarySearch1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {2, 4, 6, 9, 11, 12, 14, 20, 36, 48};
        System.out.println("Enter the Target Element:");
        int target = in.nextInt();

        int ans = search(arr, target);

        if (ans == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Found at Index=" + ans);
        }
    }

    static int search(int[] arr, int target) {
        if(arr.length==0){
            return -1;
        }
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else if (target == arr[mid]) {
                return mid;
            }
        }
        return -1;
    }
}
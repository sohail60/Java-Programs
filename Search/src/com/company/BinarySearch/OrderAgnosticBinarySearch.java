package com.company;

import java.util.Scanner;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {98, 65, 42, 32, 10, -5, -32, -64};
        System.out.println("Enter the Target:");
        int target = in.nextInt();
        int ans=search(arr,target);

        if(ans==-1) {
            System.out.println("Not Found");
        }
        else {
            System.out.println("Found at Index=" + ans);
        }
    }

    static int search(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        int start = 0, end = arr.length-1;
        while (end >= start) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (arr[0] > arr[arr.length - 1]) {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                }
            }
            else if (arr[0] < arr[arr.length - 1]) {
                    if (target > arr[mid]) {
                        start = mid + 1;
                    } else if (target < arr[mid]) {
                        end = mid - 1;
                    }
                }
            }
        return -1;
    }
}
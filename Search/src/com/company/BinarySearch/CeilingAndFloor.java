package com.company;

import java.util.Scanner;

public class CeilingAndFloor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {2, 4, 6, 9, 11, 12, 14, 20, 36, 48};
        System.out.println("Enter the Target Element:");
        int target = in.nextInt();

        int ceil = ceiling(arr, target);
        int floor = floor(arr, target);

        if (ceil == Integer.MAX_VALUE) {
            System.out.println("Ceil doesn't exist");
        } else {
            System.out.println("Ceiling=" + arr[ceil]);
        }

        if (floor == Integer.MIN_VALUE) {
            System.out.println("Floor doesn't exist");
        } else {
            System.out.println("Floor=" + arr[floor]);
        }
    }

    static int ceiling(int[] arr, int target) {
        if(target>arr[arr.length-1]){
            return Integer.MAX_VALUE;
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
        return start;
    }


    static int floor(int[] arr, int target) {
        if(target<arr[0]){
            return Integer.MIN_VALUE;
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
        return end;
    }
}
package com.company;

public class Q7 {
    public static void main(String[] args) {
            int[] arr = {2, 8, 77, 9, 45,  0, 51};
            boolean ans=duplicate(arr);
            System.out.println(ans);
        }

        static boolean duplicate(int[] arr) {
            for (int i = 0; i <= arr.length - 1; i++) {
                for (int j = i + 1; j <= arr.length - 1; j++) {
                    if (arr[i] == arr[j]) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
package com.company;

public class UniqueElement {
    public static void main(String[] args) {
        int[] arr = {2, 9, 8, 5, 9, 8, 2, 5, 6};
        int answer = unique(arr);
        System.out.println("Unique Element="+answer);
    }

    static int unique(int[] arr) {
        int answer = 0;

        for (int n : arr) {
            answer ^= n;
        }
        return answer;
    }
}
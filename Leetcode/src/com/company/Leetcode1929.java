package com.company;

public class Leetcode1929 {
    public int[] getConcatenation(int[] nums) {
        int[] arr=new int[(nums.length)*2];

        for (int i = 0; i < nums.length; i++) {
            arr[i]=nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            arr[i+1]=nums[i];
        }
        return arr;
    }
}

package com.company;

public class Leetcode1295 {

    public int findNumbers(int[] nums) {
        int digits=0,c=0;
        for (int i = 0; i < nums.length; i++) {
            digits=digits(nums[i]);
            if(digits%2==0){
                c++;
            }
        }
        return c;
    }

    public int digits(int n){
        int d=0;
        while (n>0){
            n=n/10;
            d++;
        }
        return d;
    }
}

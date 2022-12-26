package com.company;

public class Leetcode27 {
    public static void main(String[] args) {

    }

    static int remove(int[] nums,int val){
        int n=nums.length;
        int count=0;

        for (int i = 0; i < n; i++) {
            if(nums[i]!=val){
                int temp=nums[i];
                nums[i]=nums[count];
                nums[count]=temp;
                count++;
            }
        }
        return count;
    }
}

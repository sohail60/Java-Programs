package com.company;

public class Leetcode1480 {

    public int[] runningSum(int[] nums) {
        int[] answer=new int[nums.length];

        for (int i = 0; i < nums.length; i++) {

            if (i!=0){
            answer[i]=answer[i-1]+nums[i];
            } else {
                answer[i]=nums[i];
            }
        }
        return answer;
    }
}

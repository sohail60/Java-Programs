package com.company;

public class Leetcode1365 {


    public int[] smallerNumbersThanCurrent(int[] nums) {
        int count=0;
        int[] answer=new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[j]<nums[i]){
                    count++;
                }
            }
            answer[i]=count;
            count=0;
        }
        return answer;
    }
}

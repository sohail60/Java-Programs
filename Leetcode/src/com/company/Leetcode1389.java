package com.company;

import java.util.ArrayList;

public class Leetcode1389 {
    public static void main(String[] args) {

    }

    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> target =new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            target.add(index[i],nums[i]);
        }

        int[] array = new int[target.size()];
        for (int i = 0; i < target.size(); i++) {
            array[i]=target.get(i);
        }
        return array;
    }

//        public int[] createTargetArray(int[] nums, int[] index) {
//            int[] target = new int[index.length];
//            for (int i=0;i< index.length;i++) {
//                for (int j=target.length-1;j>index[i];j--) {
//                    target[j] = target[j-1];
//                }
//                target[index[i]] = nums[i];
//            }
//            return target;
//        }
}

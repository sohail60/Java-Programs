package com.company;

import java.util.ArrayList;
import java.util.List;

public class Leetcode1431 {

    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        List<Boolean> answer=kidsWithCandies(candies,extraCandies);
        System.out.println(answer);
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> answer=new ArrayList<>();

        for (int i = 0; i < candies.length; i++) {
            candies[i]+=extraCandies;

            if(max(candies,i)){
                answer.add(true);
            } else {
                answer.add(false);
            }
            candies[i]-=extraCandies;
        }
        return answer;
    }

    public static boolean max(int[] arr,int el){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        if(max==arr[el]){
            return true;
        } else {
            return false;
        }
    }
}

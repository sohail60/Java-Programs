package com.company;

import java.util.ArrayList;

public class LinearSearchList2 {
    public static void main(String[] args) {
        int[] arr={2,5,44,8,8,45};
        int target=8;
        System.out.println(search(arr,target));
    }

    static ArrayList<Integer> search(int[] arr, int target){
        return helper(arr,target,0);
    }

    static ArrayList<Integer> helper(int[] arr, int target, int index){
        ArrayList<Integer> list=new ArrayList<>();
        if(index==arr.length){
            return list;
        }

        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> downArrayLists= helper(arr, target, index+1);

        list.addAll(downArrayLists);
        return list;
    }
}

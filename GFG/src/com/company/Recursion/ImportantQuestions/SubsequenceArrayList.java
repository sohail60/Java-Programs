package com.company.Recursion.Problems;

import java.util.ArrayList;

public class SubsequenceArrayList {
    public static void main(String[] args) {
        String s="abc";String up="";
        ArrayList<String> answer=subsequence(s, up);
        System.out.println(answer);
    }

    static ArrayList<String> subsequence(String initial,String updated) {
        if (initial.isEmpty()) {
            ArrayList<String> list= new ArrayList<>();
            list.add(updated);
            return list;
        }
        char ch=initial.charAt(0);
        ArrayList<String> right=subsequence(initial.substring(1),updated);
        ArrayList<String> left=subsequence(initial.substring(1),updated+ch);

        left.addAll(right);
        return left;
    }
    }
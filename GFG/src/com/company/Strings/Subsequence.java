package com.company.Strings;

import java.util.ArrayList;

public class Subsequence {
    public static void main(String[] args) {
        String s1="abc",s2="acd";
        boolean answer=answer(s1,s2);
        System.out.println(answer);
    }

    public static boolean answer(String s1,String s2){
        ArrayList<String> list= new ArrayList<>();
        list=subsequence(s1,"");
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals(s2)){
                return true;
            }
            }
        return false;
        }

    public static ArrayList<String> subsequence(String initial, String updated) {
        if (initial.isEmpty()) {
            ArrayList<String> list= new ArrayList<>();
            list.add(updated);
            return list;
        }
        char ch=initial.charAt(0);
        ArrayList<String> right=subsequence(initial.substring(1),updated);
        ArrayList<String> left=subsequence(initial.substring(1),updated+ch);

        left.addAll(right);
//        System.out.println(left);
        return left;
    }
}

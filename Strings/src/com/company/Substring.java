package com.company;

import java.util.ArrayList;

public class Substring {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        String word = "abc";
        for (int i = 0; i < word.length(); i++) {
            for (int j = word.length(); j >i ; j--) {
                list.add(word.substring(i,j));
            }
        }
        System.out.println(list);
    }
}

package com.company;

public class Leetcode1832 {
    public static void main(String[] args) {
        String str="thequickbrownfoxjumpsoverthelazydog";
        System.out.println(isPangram(str));
    }

    static boolean isPangram(String str){
        int[] arr=new int[26];

        for (int i = 0; i < str.length(); i++) {
            arr[(str.charAt(i))-97]++;
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i]==0){
                return false;
            }
        }
        return true;
    }
}

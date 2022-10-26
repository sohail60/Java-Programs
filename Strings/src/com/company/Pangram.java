package com.company;

public class Pangram {
    public static void main(String[] args) {
        String s="The quick brown fox jumps over the lazy dog";
        boolean answer=isPangram(s);
        System.out.println(answer);
    }

    public static boolean isPangram(String s){
        s=s.toLowerCase();
        boolean[] arr=new boolean[26];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)==' '){
                continue;
            }
            arr[(int)s.charAt(i)-97]=true;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==false){
                return false;
            }
        }
        return true;
    }
}

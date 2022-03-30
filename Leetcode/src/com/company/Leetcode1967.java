package com.company;

public class Leetcode1967 {
    public static void main(String[] args) {
        String[] patterns = {"a","abc","bc","d"};
        String word = "abc";
        System.out.println(numOfStrings(patterns,word));
    }

    static int numOfStrings(String[] p, String word){
        int c=0;
        for (int i = 0; i <=p.length-1 ; i++) {
            int l=p[i].length();
            for (int j = 0; j <=word.length()-l ; j++) {
                StringBuilder s=new StringBuilder(word.substring(j,l));
                if((s.toString()).equals(p[i])){
                    c++;
                    break;
                }

            }
        }
        return c;
    }
}

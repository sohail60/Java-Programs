package com.company.Strings;

public class PatternMatching {
    public static void main(String[] args) {
        String word = "abababcd";
        String pattern = "abab";
        patternMatching(word,pattern);
    }

    public static void patternMatching(String word,String pattern){
        int n=word.length();
        int m=pattern.length();
        for (int i = 0; i <= n-m ; i++) {
            int j;
            for (j = 0; j <m ; j++) {
                if (pattern.charAt(i)!=word.charAt(j+i)){
                    break;
                }
            }
            if (j==m){
                System.out.println(i+"  ");
            }
        }
    }
}

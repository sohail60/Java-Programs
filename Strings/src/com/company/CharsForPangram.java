package com.company;

public class CharsForPangram {
    public static void main(String[] args) {
        String s="The quick brown fox jumps";
        String answer=charsForPangram(s);
        System.out.println(answer);
    }

    public static String charsForPangram(String s){
        s=s.toLowerCase();
        StringBuilder sb=new StringBuilder();
        boolean[] arr=new boolean[26];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)==' '){
                continue;
            }
            arr[(int)s.charAt(i)-97]=true;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==false){
                sb.append((char)(i+97));
            }
        }
        return sb.toString();
    }
    }